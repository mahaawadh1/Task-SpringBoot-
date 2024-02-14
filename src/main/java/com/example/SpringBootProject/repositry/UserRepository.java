package com.example.SpringBootProject.repositry;

import com.example.SpringBootProject.entitiy.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity>findByUserName(String username);



    UserEntity findByUsername(String username);
}
