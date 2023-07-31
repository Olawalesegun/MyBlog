package services;

import data.models.User;
import data.repositories.UserRepository;
import dtos.requests.LoginRequest;
import dtos.requests.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    public UserRepository userRepository;
    @Override
    public void signUp(SignupRequest signupRequest) throws Exception {
        User user = userRepository.findByEmail(signupRequest.getEmail());
        if(user != null){
            throw new Exception("This user already exists");
        }
        user.setFirstName(signupRequest.getFirstName());
        user.setLastName(signupRequest.getLastName());
        user.setEmail(signupRequest.getEmail());
        userRepository.save(user);
        //BeanUtils.copyProperties(signupRequest, user);

    }


    @Override
    public void login(LoginRequest loginRequest) {

    }
}
