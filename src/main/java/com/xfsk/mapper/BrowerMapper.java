package com.xfsk.mapper;

import com.xfsk.domain.Brower;
import com.xfsk.domain.BrowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrowerMapper {
    int countByExample(BrowerExample example);

    int deleteByExample(BrowerExample example);

    int deleteByPrimaryKey(Integer broId);

    int insert(Brower record);

    //存放浏览数据增加数据
    int insertSelective(Brower record);

    List<Brower> selectByExample(BrowerExample example);

    Brower selectByPrimaryKey(Integer broId);

    int updateByExampleSelective(@Param("record") Brower record, @Param("example") BrowerExample example);

    int updateByExample(@Param("record") Brower record, @Param("example") BrowerExample example);

    int updateByPrimaryKeySelective(Brower record);

    int updateByPrimaryKey(Brower record);
}