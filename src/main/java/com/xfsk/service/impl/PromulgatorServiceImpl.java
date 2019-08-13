package com.xfsk.service.impl;

import com.xfsk.domain.Promulgator;
import com.xfsk.mapper.PromulgatorMapper;
import com.xfsk.service.PromulgatorService;
import com.xfsk.util.InvokeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("/PromulgatorService")
public class PromulgatorServiceImpl implements PromulgatorService {

    @Autowired
    PromulgatorMapper promulgatorMapper;

    /*
    * 修改发布者信息
    * */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateByPrimaryKeySelective(Promulgator promulgator)
    {
        if (promulgator == null){
            throw new InvokeException();
        }
        return promulgatorMapper.updateByPrimaryKeySelective(promulgator);
    }

    /*
    * 得到用户总点赞数
    * */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Map<String, Object>> guidLikecount(String saleGuid) {
        if (saleGuid == null){
            throw new InvokeException();
        }
        return promulgatorMapper.guidLikecount(saleGuid);
    }


    /*
    * 根据proId查找数据
    * */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Promulgator selectByPrimaryKey(String proId) {
        if (proId == null){
            throw new InvokeException();
        }
        return promulgatorMapper.selectByPrimaryKey(proId);
    }

    /*
    * 修改用户总点赞数
    * */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int upLikecount(Integer likeCount,String proId) {
        if (likeCount == null && proId ==null){
            throw new InvokeException();
        }
        return promulgatorMapper.upLikecount(likeCount,proId);
    }

    @Override
    public int insertSelective(Promulgator promulgator) {
        if (promulgator == null){
            throw new InvokeException();
        }
        return promulgatorMapper.insertSelective(promulgator);
    }


    @Override
    public Integer selectPlikeCount(String saleGuid) {
        return promulgatorMapper.selectPlikeCount(saleGuid);
    }
}
