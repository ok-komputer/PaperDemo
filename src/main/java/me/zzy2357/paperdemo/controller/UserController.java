package me.zzy2357.paperdemo.controller;

import jakarta.servlet.http.HttpSession;
import me.zzy2357.paperdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest, HttpSession session) {
        String username = userService.login(loginRequest.username, loginRequest.passwordHash);
        if (username != null) {
            session.setAttribute("username", username);
            return username;
        } else {
            return "error";
        }
    }

    public static class LoginRequest {
        public String username;
        public String passwordHash;
    }
}
