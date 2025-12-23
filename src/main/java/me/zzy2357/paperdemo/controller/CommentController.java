package me.zzy2357.paperdemo.controller;

import jakarta.websocket.server.PathParam;
import me.zzy2357.paperdemo.entity.Comment;
import me.zzy2357.paperdemo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping("/{id}")
    public Comment getComment(@PathVariable("id") int id) {
        return commentService.getComment(id);
    }

    @GetMapping("/search")
    public String searchComment(@PathParam("keyword") String keyword) {
        return "Sorry, " + keyword + " not found."; // 模拟，默认失败
    }

    @GetMapping("/comments")
    public List<Map<String, Object>> getComments(@PathParam("amount") int amount) {
        return commentService.getComments(amount);
    }

    @PostMapping("/new")
    public int newComment(@RequestBody NewCommentRequest newCommentRequest) {
        return commentService.newComment(newCommentRequest.content);
    }

    public static class NewCommentRequest {
        public String content;
    }
}
