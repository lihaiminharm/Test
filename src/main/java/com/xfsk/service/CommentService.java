package com.xfsk.service;

import com.xfsk.domain.Comment;

import java.util.List;
import java.util.Map;

/**
 * Created by wth on 2019/8/12.
 */
public interface CommentService {

    int insertSelective(Comment commentSave);

    List<Map<String,Object>> getContext(String saleGuid);
    int deVid(Integer vidId);
}
