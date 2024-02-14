package com.example.SpringBootProject.service;

import com.example.SpringBootProject.InvalidCredentialsException;
import com.example.SpringBootProject.bo.LoginRequest;
import com.example.SpringBootProject.bo.LoginResponse;
import com.example.SpringBootProject.service.interfaceAuth.AuthenticationService;
import org.springframework.stereotype.Service;


@Service
public class AuthService implements AuthenticationService {


    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        if (isValidCredentials(loginRequest.getUsername(), loginRequest.getPassword())) {
            String token = generateToken(loginRequest.getUsername());
            return new LoginResponse(token);
        } else {
            throw new InvalidCredentialsException("Invalid username or password");
        }
    }

    @Override
    public void logout() {
    }

    private boolean isValidCredentials(String username, String password) {
        return "user".equals(username) && "password".equals(password);
    }

    private String generateToken(String username) {

        return "generated_token";
    }
}



