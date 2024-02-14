package com.example.SpringBootProject.service;

import com.example.SpringBootProject.entitiy.UserEntity;
import com.example.SpringBootProject.repositry.UserRepository;
import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;


public interface UserService {
//    void signup(UserEntity userDTO);

    @Autowired
    UserRepository userRepository = null;

    @Transactional
    public default void updateProfile(UserEntity userProfileDTO) {
        UserEntity user = userRepository.findByUsername(userProfileDTO.getUsername());
        if (user == null) {

        } else {

            user.setEmail(userProfileDTO.getEmail());
            user.setPhoneNumber(userProfileDTO.getPhoneNumber());
            user.setAddress(userProfileDTO.getAddress());
            user.setPassword(userProfileDTO.getPassword());

        }
    }

    void signup(UserEntity user);
}

