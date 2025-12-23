package me.zzy2357.paperdemo.dao;

import me.zzy2357.paperdemo.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class CommentDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Comment getComment(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM comments where id = ?",
                new BeanPropertyRowMapper<>(Comment.class), id);
    }

    public List<Map<String, Object>> getComments(int amount) {
        return jdbcTemplate.queryForList("SELECT * FROM comments ORDER BY id DESC LIMIT ?", amount);
    }

    public int newComment(String content) {
        return jdbcTemplate.update("INSERT INTO comments (content) VALUES (?)",
                new Object[] { content });
    }
}
