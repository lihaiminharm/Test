package com.xfsk.service.impl;

import com.xfsk.domain.Comment;
import com.xfsk.mapper.CommentMapper;
import com.xfsk.service.CommentService;
import com.xfsk.util.InvokeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by wth on 2019/8/12.
 */

@Service()
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertSelective(Comment commentSave) {
        if (commentSave == null){
            throw  new InvokeException();
        }
        return commentMapper.insertSelective(commentSave);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Map<String, Object>> getContext(String saleGuid) {
        if (saleGuid == null){
            throw  new InvokeException();
        }
        return commentMapper.getContext(saleGuid);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deVid(Integer vidId) {
        if (vidId == null){
            throw  new InvokeException();
        }
        return commentMapper.deVid(vidId);
    }
}
