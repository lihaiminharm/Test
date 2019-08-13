package com.xfsk.mapper;

import com.xfsk.domain.Video;
import com.xfsk.domain.VideoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    int countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(Integer vidId);

    int insert(Video record);

    int insertSelective(Video record);

    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(Integer vidId);

    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);

    List<Map<String,Object>>  selectGuid(String saleGuid);

    Video selectByCount(Integer videoId);
    int selectVlikeCount(String vidVideo);

    List<Map<String,Object>> selectLike(String saleGuid);
    int delectAll(String vidVideo);
    int delectWhole(Integer vidId);
    Integer selectIlikeCount(Integer vidId);
    String selectIvideo(Integer vidId);
}