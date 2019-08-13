package com.xfsk.service.impl;

import com.xfsk.domain.Message;
import com.xfsk.mapper.MessageMapper;
import com.xfsk.service.MessageService;
import com.xfsk.util.InvokeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wth on 2019/7/24.
 */
@Service("/MessageService")
public class MessageServiceImpl implements MessageService{

    @Autowired
    MessageMapper messageMapper;

    /*
    * 根据guid查询message表中的数据
    */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Message selectByPrimaryKey(String saleGuid) {
        if (saleGuid == null){
            throw new InvokeException();
        }
        return messageMapper.selectByPrimaryKey(saleGuid);
    }


    /*
    * 修改message表中的数据
    */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateByPrimaryKey(Message record){
        if (record == null){
            throw new InvokeException();
        }
        return messageMapper.updateByPrimaryKey(record);
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int setMsgidNull(String saleGuid)
    {
        return messageMapper.setMsgidNull(saleGuid);
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer selectMVId(String saleGuid) {
        return messageMapper.selectMVId(saleGuid);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String getOpenId(String saleGuid) {
        return messageMapper.getOpenId(saleGuid);
    }
}
