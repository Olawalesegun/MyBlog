package services;

import dtos.requests.LoginRequest;
import dtos.requests.SignupRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public void signUp(SignupRequest signupRequest) throws Exception;
    public void login(LoginRequest loginRequest);
    //CREATE

    //READ

    //UPDATE

    //DELETE
}
