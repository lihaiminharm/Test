package com.xfsk.service.impl;

import com.xfsk.domain.Video;
import com.xfsk.mapper.VideoMapper;
import com.xfsk.service.VideoService;
import com.xfsk.util.InvokeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by wth on 2019/7/25.
 */
@Service("/VideoService")
public class VideoServiceImpl implements VideoService{

    @Autowired
    VideoMapper videoMapper;

    /*
    * 删除相关点赞数据
    * */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delectAll(String vidVideo) {
        if (vidVideo == null){
            throw new InvokeException();
        }
        return videoMapper.delectAll(vidVideo);
    }


    /*
    * 查询guid
    * */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Map<String,Object>> selectGuid(String saleGuid){
        if (saleGuid == null){
            throw new InvokeException();
        }
        return videoMapper.selectGuid(saleGuid);
    }


    /*
    * 更新数据
    * */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateByPrimaryKeySelective(Video record) {
        if (record == null){
            throw new InvokeException();
        }
        return videoMapper.updateByPrimaryKeySelective(record);
    }

    /*
    * 插入视频地址
    * */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertSelective(Video record) {
        if (record == null){
            throw new InvokeException();
        }
        return videoMapper.insertSelective(record);
    }


    /*
    * 根据vidId查询数据
    * */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Video selectByPrimaryKey(Integer vidId){
        if (vidId == null){
            throw new InvokeException();
        }
        return videoMapper.selectByPrimaryKey(vidId);
    }


    /*
    * 查询video表中的数据获得点赞数
    * */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer selectVlikeCount(String vidVideo) {
        if (vidVideo == null){
            throw new InvokeException();
        }
        return videoMapper.selectVlikeCount(vidVideo);
    }

    /*
    * 查询点赞总数
    * */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Map<String,Object>> selectLike(String saleGuid) {
        if (saleGuid == null){
            throw new InvokeException();
        }
        return videoMapper.selectLike(saleGuid);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delectWhole(Integer vidId) {
        return videoMapper.delectWhole(vidId);
    }
//        }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer selectIlikeCount(Integer vidId) {
        return videoMapper.selectIlikeCount(vidId);
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public String selectIvideo(Integer vidId) {
        return videoMapper.selectIvideo(vidId);
    }
}
