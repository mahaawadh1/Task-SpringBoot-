package com.example.SpringBootProject.controller;


import com.example.SpringBootProject.bo.LoginRequest;
import com.example.SpringBootProject.bo.LoginResponse;
import com.example.SpringBootProject.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/api/auth")
    public class AuthController {

        @Autowired
        private AuthService authService;

        @PostMapping("/login")
        public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
            LoginResponse loginResponse = authService.login(loginRequest);
            return ResponseEntity.ok(loginResponse);
        }

        @PostMapping("/logout")
        public ResponseEntity<Void> logout() {
            authService.logout();
            return ResponseEntity.ok().build();
        }
    }

