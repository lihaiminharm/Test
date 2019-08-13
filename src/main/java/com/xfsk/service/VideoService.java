package com.xfsk.service;

import com.xfsk.domain.Video;

import java.util.List;
import java.util.Map;

/**
 * Created by wth on 2019/7/25.
 */
public interface VideoService {

    //删除相关点赞数据
    int delectAll(String vidVideo);

    //查询guid
    List<Map<String,Object>> selectGuid(String saleGuid);
    //更新数据
    int updateByPrimaryKeySelective(Video record);
    //插入视频地址
    int insertSelective(Video record);

    //根据vidId查询数据
    Video selectByPrimaryKey(Integer vidId);

    //查询video表中的数据获得点赞数
    Integer selectVlikeCount(String vidVideo);

    //查询点赞总数
    List<Map<String,Object>>  selectLike(String saleGuid);

    int delectWhole(Integer vidId);

    Integer selectIlikeCount(Integer vidId);

    String selectIvideo(Integer vidId);
//    Video selectByCount(Integer videoId);
}
