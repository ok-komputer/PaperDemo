package me.zzy2357.paperdemo.service;

import me.zzy2357.paperdemo.dao.CommentDao;
import me.zzy2357.paperdemo.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CommentService {
    @Autowired
    CommentDao commentDao;

    public Comment getComment(int id) {
        return commentDao.getComment(id);
    }

    public List<Map<String, Object>> getComments(int amount) {
        return commentDao.getComments(amount);
    }

    public int newComment(String content) {
        return commentDao.newComment(content);
    }
}
