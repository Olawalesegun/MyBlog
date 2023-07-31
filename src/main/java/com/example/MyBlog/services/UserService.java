package com.example.MyBlog.services;

import com.example.MyBlog.data.models.User;
import com.example.MyBlog.dtos.requests.LoginRequest;
import com.example.MyBlog.dtos.requests.SignupRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User signUp(SignupRequest signupRequest) throws Exception;
    public void login(LoginRequest loginRequest);
    //CREATE

    //READ

    //UPDATE

    //DELETE
}
