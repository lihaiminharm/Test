package com.xfsk.service;

import com.xfsk.domain.Promulgator;

import java.util.List;
import java.util.Map;
/**
 * Created by wth on 2019/8/5.
 */
public interface PromulgatorService {

    //修改发布者信息
    int updateByPrimaryKeySelective(Promulgator record);

    //得到用户总点赞数
    List<Map<String,Object>> guidLikecount(String saleGuid);

    //根据proId查找数据
    Promulgator selectByPrimaryKey(String proId);

    //修改用户总点赞数
    int upLikecount(Integer likeCount,String proId);


    int insertSelective(Promulgator record);

    Integer selectPlikeCount(String saleGuid);
}
