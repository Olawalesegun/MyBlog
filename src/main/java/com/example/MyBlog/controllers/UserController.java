package com.example.MyBlog.controllers;

import com.example.MyBlog.data.models.User;
import com.example.MyBlog.dtos.requests.SignupRequest;
import com.example.MyBlog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value="/value", method=RequestMethod.POST)
    public User signup(@RequestBody SignupRequest signupRequest) throws Exception {
        return userService.signUp(signupRequest);
    }
}
