package com.example.SpringBootProject.service;

import com.example.SpringBootProject.entitiy.UserEntity;
import com.example.SpringBootProject.repositry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class UserServiceImpl implements UserService {

        @Autowired
        private UserRepository userRepository;

        @Override
        public void signup(UserEntity userDTO) {
            UserEntity user = new UserEntity();
            user.setUsername(userDTO.getEmail());
            user.setEmail(userDTO.getEmail());
            user.setPhoneNumber(userDTO.getPhoneNumber());
            user.setAddress(userDTO.getAddress());
            user.setPassword(userDTO.getPassword());

            userRepository.save(user);
        }
    }


