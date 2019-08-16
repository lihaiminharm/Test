package com.xfsk.mapper;

import com.xfsk.domain.Message;
import com.xfsk.domain.MessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper {
    int countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(String saleGuid);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(String saleGuid);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    int findById();
    int updateMsgidNull(String saleGuid);
    int selectMVId(String saleGuid);
    String getOpenId(String saleGuid);

    List<Message> getVideoInfo(String saleGuid);
}