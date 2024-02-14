package com.example.SpringBootProject.repositry;

import com.example.SpringBootProject.entitiy.GuestSuggestionEntity;
import com.example.SpringBootProject.enums.SuggestionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface GuestSuggestionRepository extends JpaRepository<GuestSuggestionEntity, Long> {
    List<GuestSuggestionEntity> findByStatus(SuggestionStatus status);

    List<GuestSuggestionEntity> findAllDistinctBySuggestionText();
}