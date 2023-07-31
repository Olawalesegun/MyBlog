package com.example.MyBlog.services;

import com.example.MyBlog.data.models.User;
import com.example.MyBlog.data.repositories.UserRepository;
import com.example.MyBlog.dtos.requests.LoginRequest;
import com.example.MyBlog.dtos.requests.SignupRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    public UserRepository userRepository;
    @Override
    public User signUp(SignupRequest signupRequest) throws Exception {
        User user = userRepository.findByEmail(signupRequest.getEmail());
        if(user != null){
            throw new Exception("This user already exists");
        }
        user.setFirstName(signupRequest.getFirstName());
        user.setLastName(signupRequest.getLastName());
        user.setEmail(signupRequest.getEmail());
        return userRepository.save(user);
        //BeanUtils.copyProperties(signupRequest, user);

    }


    @Override
    public void login(LoginRequest loginRequest) {

    }
}
