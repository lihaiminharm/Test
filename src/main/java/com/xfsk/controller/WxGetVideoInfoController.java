package com.xfsk.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.xfsk.domain.Message;
import com.xfsk.domain.Promulgator;
import com.xfsk.domain.UserLike;
import com.xfsk.domain.Video;
import com.xfsk.service.*;
import com.xfsk.util.BizException;
import com.xfsk.util.OSSutil;
import com.xfsk.util.ResultMessageDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.xfsk.util.OpenUtil.sendGet;
import static com.xfsk.util.StringDate.timeStamp2Date;


@Controller
public class WxGetVideoInfoController
{

    private static final Logger logger = LoggerFactory.getLogger(WxResultController.class);

    @Autowired
    VideoService videoService;

    @Autowired
    MessageService messageService;

    @Autowired
    LikeService likeService;

    @Autowired
    PromulgatorService promulgatorService;

    @Autowired
    CommentService commentService;

    /**
     * @Title: getSmallProgramOpenId
     * @author：lihuimin,wangtianhao
     * @date：2019年7月25日
     * @Description: 获取Openid
     * @param code
     * @return
     */
    @RequestMapping("/getOpenId")
    @ResponseBody
    public JSONObject getSmallProgramOpenId(String code) {
        //将网址 appid secret grant_type js_code 这些参数进行设置
        String SMALL_PROGRAM_OPEN_ID_URL = "https://api.weixin.qq.com/sns/jscode2session?appid=wx3a7f3b577177a5c8&secret=b7c8b58f0fb6d2f6bd719c7c6639afb2&js_code=CODE&grant_type=authorization_code";
        //将js_code 中的参数变成前端发过来的code 编码格式 utf-8  时间 10000毫秒 获取字符
        return JSONObject.parseObject(sendGet(SMALL_PROGRAM_OPEN_ID_URL.replace("CODE", code), "utf-8", 10000));
    }

    /**
     * @Title: getGuid
     * @author：lihuimin,wangtianhao
     * @date：2019年7月25日
     * @Description: 后台向微信端传送视频地址
     * @param saleGuid  guid
     * @return
     */
    @RequestMapping("/getGuid")
    @ResponseBody
    public Object getGuidAndViewVideo(String saleGuid) throws BizException {
        //创建Datamap对象，用于存储数据
        Map<String,Object> Datamap=new HashMap<String,Object>();
        //查询Video->url地址
        List<Map<String,Object>> resultVideoUrl= videoService.selectGuid(saleGuid);
        //查询点赞总赞数
        List<Map<String,Object>> resultLikecount= videoService.selectLike(saleGuid);

        //map用来存放数据为空是发送的数据
        Map<String,Object> map=new HashMap<String ,Object>();
        //判断查询对象中是否存在视频，如果存在视频则获取url地址，如果不存在则返回0
        try {
            if(resultVideoUrl.toString().equals("[null]")){
                System.out.println(resultVideoUrl.toString());
                map.put("vidVideo",0);
                resultVideoUrl.clear();
                resultVideoUrl.add(map);
                Datamap.put("count",resultVideoUrl.size());
                Datamap.put("data",resultVideoUrl);
            }if(resultVideoUrl.size()==0 ){
                map.put("vidVideo", 0);
                resultVideoUrl.add(map);
                Datamap.put("count", resultVideoUrl.size());
                Datamap.put("data", resultVideoUrl);
            } else {
                Datamap.put("code",0);
                Datamap.put("msg","获取数据");
                Datamap.put("data",resultVideoUrl);
                if(resultLikecount.toString().equals("[null]")){
                    resultLikecount.clear();
                    map.put("vidLikeCount",0);
                    resultLikecount.add(map);
                    Datamap.put("likecount", resultLikecount);
                }
                else {
                    Datamap.put("likecount",resultLikecount);
                }

                //将Datamap对象数据转换为string
                String str = JSON.toJSONString(Datamap, SerializerFeature.WriteMapNullValue);
                //将string转换成json数据
                JSONObject jsonObject = JSONObject.parseObject(str);
                //获取json数据中的data数据
                String r = jsonObject.getString("data");
                //将data对象转换成list对象
                List<Video> list = JSONObject.parseArray(r,Video.class);
                //获取到list集合中的vidVideo的值和空字符串进行比较
                if (list.get(0).getVidVideo().equals("")|| OSSutil.OssTF(list.get(0).getVidVideo())==false){
                    map.put("vidVideo",0);
                    resultVideoUrl.clear();
                    resultVideoUrl.add(map);
                    Datamap.put("data",resultVideoUrl);
                    //获取发布者表中总赞数
                    JSONObject proCount = JSONObject.parseObject(JSON.toJSONString(promulgatorService.guidLikecount(saleGuid).get(0),
                            SerializerFeature.WriteMapNullValue));
                    //更新发布者表中点赞数据
                    promulgatorService.upLikecount(proCount.getInteger("proLikeCount")-videoService.selectVlikeCount(list.get(0).getVidVideo())
                            ,proCount.getString("proId"));
                    //删除视频表中的数据
                    videoService.delectAll(list.get(0).getVidVideo());
                }
                Datamap.put("count",resultVideoUrl.size());
            }


        }catch (Exception e){
            logger.error(e.getLocalizedMessage(), e);
            throw new BizException(e.getLocalizedMessage());
        }

        //利用fastJson将数据转换成json数据
        JSONObject WxRusultjsonObject=JSONObject.parseObject(JSONObject.toJSONString(Datamap));
        return WxRusultjsonObject;
    }

    /**
     * @Title: getLike
     * @author：lihuimin,wangtianhao
     * @date：2019年8月1日
     * @Description: 点赞功能
     * @param broOpenId，saleGuid，video，promulgator
     * @return
     */
    @RequestMapping("/getLike")
    @ResponseBody
    public ResultMessageDto getLike(String broOpenId, String saleGuid, Video videoNum, Promulgator promulgatorNum) {
        ResultMessageDto<String>  resultMessageDto = new ResultMessageDto<>();
        try {
            //查找发布者id,视频id
            UserLike Prolike = new UserLike();
            Message messageInfo = messageService.selectByPrimaryKey(saleGuid);
            String UserOpenid = messageInfo.getMsgId();

            Prolike.setLikeId(broOpenId);
            Prolike.setLikeDatetime(new Date());
            Prolike.setVidId(messageInfo.getVideoId());
            likeService.insertSelective(Prolike);

            //根据videoId查询视频，并将该视频的喜欢次数+1
            videoNum = videoService.selectByPrimaryKey(messageInfo.getVideoId());
            if(videoNum.getVidLikeCount()==null){
                videoNum.setVidLikeCount((long) 1);
                videoService.updateByPrimaryKeySelective(videoNum);
                //根据视频发布者的id查询发布者信息，并将点赞数+1
                promulgatorNum = promulgatorService.selectByPrimaryKey(UserOpenid);
                promulgatorNum.setProLikeCount(promulgatorNum.getProLikeCount()+1);
                promulgatorService.updateByPrimaryKeySelective(promulgatorNum);
            }else{
                videoNum.setVidLikeCount(videoNum.getVidLikeCount()+1);
                videoService.updateByPrimaryKeySelective(videoNum);
                //根据视频发布者的id查询发布者信息，并将点赞数+1
                promulgatorNum = promulgatorService.selectByPrimaryKey(UserOpenid);
                promulgatorNum.setProLikeCount(promulgatorNum.getProLikeCount()+1);
                promulgatorService.updateByPrimaryKeySelective(promulgatorNum);
                resultMessageDto.setMessage("成功");
            }
            return resultMessageDto;
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            throw new BizException(e.getLocalizedMessage());
        }

    }

    /**
     * @Title: UnLike
     * @author：lihuimin,wangtianhao
     * @date：2019年8月1日
     * @Description: 取消点赞功能
     * @param broOpenId，saleGuid，video，promulgator
     * @return
     */
    @RequestMapping("/UnLike")
    @ResponseBody
    public ResultMessageDto UnLike(String broOpenId, String saleGuid, Video videoNum, Promulgator promulgatorNum) {
        ResultMessageDto<String>  resultMessageDto = new ResultMessageDto<>();
        try {
            Message messageInfo = messageService.selectByPrimaryKey(saleGuid);
            Integer VidId = messageInfo.getVideoId();
            //通过该元素的id对该元素进行删除
            likeService.deleteByVideoId(broOpenId,messageInfo.getVideoId());
            //通过视频的id查询视频，并将该视频的喜欢数量减一，并保存
            videoNum = videoService.selectByPrimaryKey(VidId);
            //根据发布者的id查询到发布者的用户信息，并将改用户的被点赞数减一，并保存回数据库
            promulgatorNum = promulgatorService.selectByPrimaryKey(messageInfo.getMsgId());
            if (videoNum.getVidLikeCount()>0 && promulgatorNum.getProLikeCount() > 0){
            videoNum.setVidLikeCount(videoNum.getVidLikeCount()-1);
            videoService.updateByPrimaryKeySelective(videoNum);
            promulgatorNum.setProLikeCount(promulgatorNum.getProLikeCount()-1);
            promulgatorService.updateByPrimaryKeySelective(promulgatorNum);
            }else {
                videoNum.setVidLikeCount((long) 0);
                promulgatorNum.setProLikeCount(0);
            }
            resultMessageDto.setMessage("成功");
            return resultMessageDto;

        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            throw new BizException(e.getLocalizedMessage());
        }

    }


    @RequestMapping(value = "/getComment")
    @ResponseBody
    public Object GetCommentToWx(String saleGuid){
        //创建Datamap对象，用于存储数据
        Map<String,Object> Datamap=new HashMap<String,Object>();
        //查询弹幕
        List<Map<String,Object>> resultComment =  commentService.getContext(saleGuid);
        //map用来存放数据为空是发送的数据
        Map<String,Object> map=new HashMap<String ,Object>();
        try {
            if (resultComment.toString().equals("[null]")){
                resultComment.clear();
                map.put("count",0);
                resultComment.add(map);
                Datamap.put("comment",resultComment);
            }else {
                Datamap.put("comment",resultComment);
            }
        }catch (Exception e){
            logger.error(e.getLocalizedMessage(), e);
            throw new BizException(e.getLocalizedMessage());
        }
        //利用fastJson将数据转换成json数据
        JSONObject WxRusultjsonObject=JSONObject.parseObject(JSONObject.toJSONString(Datamap));
     return  WxRusultjsonObject;
    }

    @RequestMapping("/getVideoInfoToWx")
    @ResponseBody
    public Object GetVideoInfoToWx(String saleGuid,String broOpenId){
            Map<String,Object> saveVideoInfo=new HashMap<String,Object>();
            Message message = messageService.selectByPrimaryKey(saleGuid);
            List<Message> videoInfo = messageService.getVideoInfo(saleGuid);
            long time = message.getMsgDatetime().getTime();
            String t = String.valueOf(time/1000);
            String date1 = timeStamp2Date(t, "yyyy-MM-dd");

            String date2 = timeStamp2Date(t, "HH:mm:ss");
        try{
            if (!message.getMsgId().equals(broOpenId)){
                saveVideoInfo.put("code",0);
                saveVideoInfo.put("data",videoInfo);
                saveVideoInfo.put("year",date1);
                saveVideoInfo.put("time",date2);

            }else {
                saveVideoInfo.put("code",1);
                saveVideoInfo.put("data",videoInfo);
                saveVideoInfo.put("year",date1);
                saveVideoInfo.put("time",date2);
            }

        }
        catch (Exception e){
            logger.error(e.getLocalizedMessage(),e);
            throw  new  BizException(e.getLocalizedMessage());
        }
        JSONObject VideoToWxjsonObject = JSONObject.parseObject(JSONObject.toJSONString(saveVideoInfo));

        return VideoToWxjsonObject;
//        return 0;

    }



}
