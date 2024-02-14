package com.example.SpringBootProject.repositry;
import com.example.SpringBootProject.entitiy.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
    }


