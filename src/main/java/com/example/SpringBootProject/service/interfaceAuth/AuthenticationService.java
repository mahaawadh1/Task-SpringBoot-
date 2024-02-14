package com.example.SpringBootProject.service.interfaceAuth;


import com.example.SpringBootProject.bo.LoginRequest;
import com.example.SpringBootProject.bo.LoginResponse;

public interface AuthenticationService {
    LoginResponse login(LoginRequest loginRequest);

    void logout();
}


