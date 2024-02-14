package com.example.SpringBootProject.entitiy;


import javax.persistence.*;

@Entity
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private final double balance = 0.0;


}
