package com.xfsk.service;

import com.xfsk.domain.Brower;

/**
 * Created by harm on 2019/7/29.
 */
public interface BrowerService {

    //插入浏览记录
    int insertSelective(Brower brower);
}
