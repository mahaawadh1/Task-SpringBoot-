package com.example.SpringBootProject.service;
import com.example.SpringBootProject.entitiy.GuestSuggestionEntity;
import com.example.SpringBootProject.enums.SuggestionStatus;
import com.example.SpringBootProject.repositry.GuestSuggestionRepository;
import com.example.SpringBootProject.service.interfaceAuth.SuggestionProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestSuggestionService {
    @Autowired
    private GuestSuggestionRepository repository;


    public SuggestionProcessor printAndProcessSuggestion() {
        return suggestionText -> {
            GuestSuggestionEntity suggestionEntity = new GuestSuggestionEntity();
            suggestionEntity.setSuggestionText(suggestionText);
            repository.save(suggestionEntity);
        };
    }

    public List<GuestSuggestionEntity> findAllCreatedSuggestions() {
        return repository.findByStatus(SuggestionStatus.CREATE);
    }

    public List<GuestSuggestionEntity> findAllRemovedSuggestions() {
        return repository.findByStatus(SuggestionStatus.REMOVE);
    }

    public List<GuestSuggestionEntity> findAllUniqueSuggestions() {
        return repository.findAllDistinctBySuggestionText();
    }


    public List<GuestSuggestionEntity> getCreateStatusSuggestions() {
        return repository.findByStatus(SuggestionStatus.CREATE);
    }

    public List<GuestSuggestionEntity> getRemoveStatusSuggestions() {
        return repository.findByStatus(SuggestionStatus.REMOVE);
    }





}


