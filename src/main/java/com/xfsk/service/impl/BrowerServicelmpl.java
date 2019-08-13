package com.xfsk.service.impl;

import com.xfsk.domain.Brower;
import com.xfsk.mapper.BrowerMapper;
import com.xfsk.service.BrowerService;
import com.xfsk.util.InvokeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by harm on 2019/7/29.
 */
@Service()
public class BrowerServicelmpl implements BrowerService {

    @Autowired
    BrowerMapper browerMapper;

    /*
    *插入浏览记录
    */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertSelective(Brower brower) {
        if (brower == null){
            throw new InvokeException();
        }
        return browerMapper.insert(brower);
    }
}
