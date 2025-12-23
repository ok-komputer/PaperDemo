package me.zzy2357.paperdemo.service;

import me.zzy2357.paperdemo.dao.UserDao;
import me.zzy2357.paperdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getUser(String username) {
        return new User();
    }

    public String login(String username, String passwordHash) {
        return userDao.login(username, passwordHash).username;
    }
}
