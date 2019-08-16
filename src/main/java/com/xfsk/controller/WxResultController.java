package com.xfsk.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.mts.model.v20140618.SubmitJobsRequest;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.xfsk.domain.*;
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

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.xfsk.util.OpenUtil.sendGet;


@Controller
public class WxResultController {

    private static final Logger logger = LoggerFactory.getLogger(WxResultController.class);

    @Autowired
    VideoService videoService;

    @Autowired
    MessageService messageService;

    @Autowired
    BrowerService browerService;

    @Autowired
    PromulgatorService promulgatorService;

    @Autowired
    LikeService likeService;

    @Autowired
    CommentService commentService;

    /**
     * @Title: isLike
     * @author：lihuimin,wangtianhao
     * @date：2019年7月25日
     * @Description: 查看是否点赞
     * @param likeId  saleGuid
     * @return
     */
    @RequestMapping("/isLike")
    @ResponseBody
    public Integer isLike(String likeId,String saleGuid){

        try {
            //根据guid获取videoid
            Message messageId=messageService.selectByPrimaryKey(saleGuid);
            Integer vidId=messageId.getVideoId();
            return likeService.selectTF(likeId,vidId);
        }catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            throw new BizException(e.getLocalizedMessage());
        }
    }

    /**
     * @Title: insertBrower
     * @author：lihuimin,wangtianhao
     * @date：2019年8月1日
     * @Description: 浏览视频记录
     * @param saleGuid，username，sex，location，longitude，latitude
     * @return
     */
    @RequestMapping("/Brower")
    @ResponseBody
    public Object GetVideoBrowerRecord(String saleGuid,String username, String sex, String
            location, Float longitude, Float latitude) {
        try {

            //存浏览记录
            Brower saveBrowerRecord = new Brower();
            //根据guid查询message信息
            Message messageInfo = messageService.selectByPrimaryKey(saleGuid);

            //判断浏览次数是否为空，如果为空浏览时赋值为1 否则将浏览次数加1
            if(messageInfo.getMsgTimes()==null){
                messageInfo.setMsgTimes((long) 1);
            }else {
                messageInfo.setMsgTimes(messageInfo.getMsgTimes()+1);
            }
            if(messageInfo.getMsgId()==null ||messageInfo.getMsgId().equals("") ) {
                return -1;
            }
            else{
                //将数据存储到浏览表中
                saveBrowerRecord.setBroDatetime(new Date());
                saveBrowerRecord.setSaleGuid(saleGuid);
                //在message表中查询到序列码将序列码存放到浏览表中
                saveBrowerRecord.setBroCode(messageInfo.getBroCode());
                saveBrowerRecord.setBroProUsername(username);
                saveBrowerRecord.setBroProSex(sex);
                saveBrowerRecord.setBroProLocation(location);
                saveBrowerRecord.setBroProLongitude(longitude);
                saveBrowerRecord.setBroProLatitude(latitude);
                //将数据存放到brower表中
                int i = browerService.insertSelective(saveBrowerRecord);
                //更新message表中数据
                messageService.updateByPrimaryKey(messageInfo);
                return i;

            }
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            throw new BizException(e.getLocalizedMessage());
        }
    }

    /**
     * @Title: insertVideo
     * @author：lihuimin,wangtianhao
     * @date：2019年8月1日
     * @Description: 视频转码插入视频地址到数据库
     * @param saleGuid，url
     * @return
     */
    @RequestMapping("/insertVideo")
    @ResponseBody
    public ResultMessageDto GetVideoUrl( String saleGuid, String url,String openId,String proUsername,String proSex,String proLocation,Float longtiude,Float latitude,Promulgator promulgatorInfo) throws BizException{
        String ossInputObject = url;//转码文件路径（艺文上传成功后发过来）test后面的
        String ossOutputObject = url;//转码之后的路径和文件名称


        // 创建DefaultAcsClient实例并初始化
        DefaultProfile profile = DefaultProfile.getProfile(
                OSSutil.getMpsRegionId(),      // 地域ID
                OSSutil.getAccessKeyId(),      // RAM账号的AccessKey ID
                OSSutil.getAccessKeySecret()); // RAM账号Access Key Secret
        IAcsClient client = new DefaultAcsClient(profile);
        // 创建API请求并设置参数
        SubmitJobsRequest request = new SubmitJobsRequest();
        // 放入参数
        JSONObject input = new JSONObject();
        input.put("Location", OSSutil.getOssLocation());
        input.put("Bucket", OSSutil.getOssBucket());
        try {
            input.put("Object", URLEncoder.encode(ossInputObject, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("input URL encode failed");
        }
        request.setInput(input.toJSONString());
        // Output
        String outputOSSObject;
        try {
            outputOSSObject = URLEncoder.encode(ossOutputObject, "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("output URL encode failed");
        }
        JSONObject output = new JSONObject();
        output.put("OutputObject", outputOSSObject);
        // Ouput->Container
        JSONObject container = new JSONObject();
        container.put("Format", "mp4");//转码后的文件类型
        output.put("Container", container.toJSONString());//放入JSONObject
        //声明图像JSONObject
        JSONObject video = new JSONObject();
        video.put("Codec", "H.264");//编码格式
        video.put("Bitrate", "550");//视频码率
        video.put("Width", "640");//视频宽度
        video.put("Fps", "20");//帧数
        output.put("Video", video.toJSONString());//放入
        //声明音频JSONObject
        JSONObject audio = new JSONObject();
        audio.put("Codec", "AAC");//编码格式
        audio.put("Bitrate", "128");//音频码率
        audio.put("Channels", "2");//双声道
        audio.put("Samplerate", "44100");//取样音频数
        output.put("Audio", audio.toJSONString());//放入
        JSONArray outputs = new JSONArray();
        outputs.add(output);
        request.setOutputs(outputs.toJSONString());
        request.setOutputBucket(OSSutil.getOssBucket());
        request.setOutputLocation(OSSutil.getOssLocation());
        // PipelineId
        request.setPipelineId(OSSutil.getPipelineId());
        // 发起请求并处理应答或异常
        SubmitJobsResponse response;
        try {
            response = client.getAcsResponse(request);
            System.out.println("RequestId is:"+response.getRequestId());
            if (response.getJobResultList().get(0).getSuccess()) {
                System.out.println("JobId is:" + response.getJobResultList().get(0).getJob().getJobId());
            } else {
                System.out.println("SubmitJobs Failed code:" + response.getJobResultList().get(0).getCode() +
                        " message:" + response.getJobResultList().get(0).getMessage());
            }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        //存放Video
        Video videoUrl = new Video();
        //返回数据
        ResultMessageDto<String>  resultMessageDto = new ResultMessageDto<>();

        try {
            //异常处理
            if (saleGuid.equals("")||saleGuid==null){
                throw new BizException("参数不允许为空。");
            }
            Message message = messageService.selectByPrimaryKey(saleGuid);
            //查询对象中guid是否为空
            if (message.getSaleGuid().equals("")||message.getSaleGuid()!=null){
                Promulgator promulgator = promulgatorService.selectByPrimaryKey(openId);
                if (promulgator==null){
                    promulgatorInfo.setProId(openId);
                    promulgatorInfo.setProDatetime(new Date());
                    promulgatorInfo.setProUsername(proUsername);
                    promulgatorInfo.setProSex(proSex);
                    promulgatorInfo.setProLocation(proLocation);
                    promulgatorInfo.setProLatitude(latitude);
                    promulgatorInfo.setProLongitude(longtiude);
                    promulgatorService.insertSelective(promulgatorInfo);
                }else {
                    promulgatorInfo.setProId(openId);
                    promulgatorInfo.setProDatetime(new Date());
                    promulgatorInfo.setProUsername(proUsername);
                    promulgatorInfo.setProSex(proSex);
                    promulgatorInfo.setProLocation(proLocation);
                    promulgatorInfo.setProLatitude(latitude);
                    promulgatorInfo.setProLongitude(longtiude);
                    promulgatorService.updateByPrimaryKeySelective(promulgatorInfo);
                }
                videoUrl.setVidId(message.getVideoId());
                videoUrl.setVidVideo(url);
                message.setMsgId(openId);
                message.setMsgDatetime(new Date());
                //插入数据
                videoService.insertSelective(videoUrl);
                //插入发布信息
                //更新Message表中的Msgid
                messageService.updateByPrimaryKeySelective(message);
                resultMessageDto.setMessage("成功");
            }
            return resultMessageDto;
        }catch (Exception e){
            logger.error(e.getLocalizedMessage(), e);
            throw  new BizException(e.getLocalizedMessage());
        }

    }

    @RequestMapping("/insertComment")
    @ResponseBody
    public ResultMessageDto  saveCommentInfo(String saleGuid,String comment,String broOpenId,Message messageInfo,Comment commentSava) {

        ResultMessageDto resultMessageDto = new ResultMessageDto();
        try {
            messageInfo = messageService.selectByPrimaryKey(saleGuid);
            commentSava.setCommentId(broOpenId);
            commentSava.setCommentDatetime(new Date());
            commentSava.setCommentContext(comment);
            commentSava.setVidId(messageInfo.getVideoId());
            commentService.insertSelective(commentSava);
            resultMessageDto.setMessage("成功");
            return resultMessageDto;

        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            throw new BizException(e.getLocalizedMessage());
        }
    }

    @RequestMapping("/DeVideo")
    @ResponseBody
    public boolean DeVideo(boolean TFdelect,String saleGuid,String openId) {
        try {
            //根据Openid是否为发布者
            if (TFdelect == true && messageService.getOpenId(saleGuid).equals(openId)) {
                Integer vidId=messageService.selectMVId(saleGuid);
                //根据guid查询p和v表的likecount相减进行设置
                promulgatorService.upLikecount(promulgatorService.selectPlikeCount(saleGuid) - videoService.selectIlikeCount(messageService.selectMVId(saleGuid))
                        , openId);
                //message表中的Msg_id清空
                messageService.updateMsgidNull(saleGuid);
                //清除阿里云的视频 通过视频的vidId(1307)
                OSSutil.delectOSSV(videoService.selectIvideo(vidId));

                //根据guid差vid_id 然后根据vid_id删除点赞和视频表的数据
                videoService.delectWhole(vidId);
                commentService.deVid(vidId);
                return true;
            } else {
                return false;

            }
        }catch(Exception e){
                return false;
            }
        }
    @RequestMapping("/isUser")
    @ResponseBody
    public boolean isUser(String saleGuid,String openId){
        //通过saleGuid查询二维码的发布者openId根据Openid是否为发布者
        if(saleGuid==null || openId==null ||saleGuid.equals("undefined") || openId.equals("undefined")) {
            return false;
        }
        else {
            String SopenId= messageService.getOpenId(saleGuid);
            if (SopenId==null ||SopenId.equals("")) {
                return false;
            } else if(SopenId.equals(openId)){
                return true;
            }
            else {
                return false;
            }
        }
    }


    @RequestMapping("/insertVideoInfo")
    @ResponseBody
    public ResultMessageDto  GetUserInfoToWx(String saleGuid,String msgTitle,String msgPassword,String leaveMsg){
        ResultMessageDto<String>  resultMessageDto = new ResultMessageDto<>();
        try{
            Message message = messageService.selectByPrimaryKey(saleGuid);
            message.setMsgTitle(msgTitle);
            message.setMsgPassword(msgPassword);
            message.setMsgLeavemsg(leaveMsg);
            messageService.updateByPrimaryKeySelective(message);
            resultMessageDto.setMessage("成功");
        }catch (Exception e){
            logger.error(e.getLocalizedMessage(),e);
            throw new BizException(e.getLocalizedMessage());
        }
        return resultMessageDto;
    }

    }

