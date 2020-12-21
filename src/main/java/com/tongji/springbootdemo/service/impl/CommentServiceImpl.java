package com.tongji.springbootdemo.service.impl;

import com.tongji.springbootdemo.mapper.CommentMapper;
import com.tongji.springbootdemo.model.Comment;
import com.tongji.springbootdemo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> findAll() {
        return commentMapper.findAll();
    }

    public int addComment(Integer blogId, String content, Integer senderId, Date date) {
        return commentMapper.addComment(blogId, content, senderId, date);
    }
}