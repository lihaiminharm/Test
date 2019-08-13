package com.xfsk.service;

import com.xfsk.domain.UserLike;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wth on 2019/8/5.
 */
public interface LikeService {

    //GetLike方法插入点赞数
    int insertSelective(UserLike record);
    //查询是否点赞
    Integer selectTF(String likeId,Integer vidId);
    //Unlike中根据likeid,vidid删除
    int deleteByVideoId(@Param("likeId")String likeId,@Param("vidId")Integer VidId);

//    List<UserLike> getUserLikeInfo(@Param("likeId")String likeId, @Param("vidId") Integer vidId);
}
