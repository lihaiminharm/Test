package com.xfsk.service;

import com.xfsk.domain.Message;

/**
 * Created by wth on 2019/7/24.
 */
public interface MessageService {

    //根据guid查询message表中的数据
    Message selectByPrimaryKey(String saleGuid);

    //修改message表中的数据
    int updateByPrimaryKey(Message record);
//    int findById();

    int setMsgidNull(String saleGuid);


    Integer selectMVId(String saleGuid);

    String getOpenId(String saleGuid);

}
