package me.zzy2357.paperdemo.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
    public String username;
    public String passwordHash;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
