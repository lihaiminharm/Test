package com.xfsk.service.impl;

import com.xfsk.domain.UserLike;
import com.xfsk.mapper.UserLikeMapper;
import com.xfsk.service.LikeService;
import com.xfsk.util.InvokeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wth on 2019/7/25.
 */
@Service("/LikeService")
public class LikeServiceImpl implements LikeService {

    @Autowired
    UserLikeMapper likeMapper;

    /*
    *GetLike方法插入点赞数
    */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertSelective(UserLike record){
        if (record == null){
            throw new InvokeException();
        }
        return likeMapper.insertSelective(record);
    }


    /*
    *Unlike中根据likeid,vidid删除
    */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByVideoId(String likeId,Integer VidId) {
        if (likeId == null && VidId == null){
            throw new InvokeException();
        }
        return likeMapper.deleteByVideoId(likeId,VidId);
    }


    /*
    *查询是否点赞
    */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer selectTF(String likeId, Integer vidId) {
        if (likeId == null && vidId == null){
            throw new InvokeException();
        }
        return likeMapper.selectTF(likeId,vidId);
    }

//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public List<UserLike> getUserLikeInfo(String likeId, Integer vidId) {
//        if (likeId == null && vidId == null){
//            throw new InvokeException();
//        }
//        return likeMapper.getUserLikeInfo(likeId,vidId);
//    }

//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public UserLike selectByPrimaryKey(String likeId) {
//        if (likeId == null){
//            throw new InvokeException();
//        }
//        return likeMapper.selectByPrimaryKey(likeId);
//    }
}
