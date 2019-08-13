package com.xfsk.mapper;

import com.xfsk.domain.Promulgator;
import com.xfsk.domain.PromulgatorExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface PromulgatorMapper {
    int countByExample(PromulgatorExample example);

    int deleteByExample(PromulgatorExample example);

    int deleteByPrimaryKey(String proId);

    int insert(Promulgator record);

    int insertSelective(Promulgator record);

    List<Promulgator> selectByExample(PromulgatorExample example);

    Promulgator selectByPrimaryKey(String proId);

    int updateByExampleSelective(@Param("record") Promulgator record, @Param("example") PromulgatorExample example);

    int updateByExample(@Param("record") Promulgator record, @Param("example") PromulgatorExample example);

    int updateByPrimaryKeySelective(Promulgator record);

    int updateByPrimaryKey(Promulgator record);
    List<Map<String,Object>> guidLikecount(String saleGuid);
    int upLikecount(@Param("likeCount") Integer likeCount,@Param("proId") String proId);
    Integer selectPlikeCount(String saleGuid);
}