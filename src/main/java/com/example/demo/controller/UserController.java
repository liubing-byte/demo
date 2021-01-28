package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @RequestMapping("/hello")
    public String hello() {
        return "helloworld";
    }

    @GetMapping("/user")
    public String getUser() {
        return "get";
    }

    @PostMapping("/user")
    public String postUser() {
        return "post";
    }

    @PutMapping("/user")
    public String putUser() {
        return "put";
    }

    @DeleteMapping("/user")
    public String deleteUser() {
        return "delete";
    }
}
