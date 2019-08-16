package com.xfsk.service;

import com.xfsk.domain.Message;

import java.util.List;

/**
 * Created by wth on 2019/7/24.
 */
public interface MessageService {

    //根据guid查询message表中的数据
    Message selectByPrimaryKey(String saleGuid);

    //修改message表中的数据
    int updateByPrimaryKey(Message record);
//    int findById();

    int updateMsgidNull(String saleGuid);


    Integer selectMVId(String saleGuid);

    String getOpenId(String saleGuid);

    //修改个人信息页
    int updateByPrimaryKeySelective(Message record);

    //获取视频信息
    List<Message> getVideoInfo(String saleGuid);

}
