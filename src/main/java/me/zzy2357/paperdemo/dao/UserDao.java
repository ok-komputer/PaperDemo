package me.zzy2357.paperdemo.dao;

import me.zzy2357.paperdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User login(String username, String passwordHash) {
        return jdbcTemplate.queryForObject("SELECT * FROM users where username = ? AND password_hash = ?",
                new BeanPropertyRowMapper<>(User.class),
                username,
                passwordHash);
    }
}
