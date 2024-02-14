package com.example.SpringBootProject.controller;

import com.example.SpringBootProject.entitiy.UserEntity;
import com.example.SpringBootProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private
    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody UserEntity user) {
        userService.signup(user);
        return ResponseEntity.ok("User signed up successfully!");
    }

    @RequestMapping("/user")


    @PutMapping("/update-profile")
    public ResponseEntity<String> updateProfile(@RequestBody UserEntity userProfileDTO) {
        userService.updateProfile(userProfileDTO);
        return ResponseEntity.ok("Profile updated successfully!");
    }

}
