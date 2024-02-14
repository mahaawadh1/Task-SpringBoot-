package com.example.SpringBootProject.controller;

import com.example.SpringBootProject.entitiy.GuestSuggestionEntity;
import com.example.SpringBootProject.service.GuestSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/suggestion-status")
public class SuggestionStatusController {
    @Autowired
    private GuestSuggestionService suggestionService;

    @GetMapping("/created")
    public List<GuestSuggestionEntity> getCreatedSuggestions() {
        return suggestionService.findAllCreatedSuggestions();
    }

    @GetMapping("/removed")
    public List<GuestSuggestionEntity> getRemovedSuggestions() {
        return suggestionService.findAllRemovedSuggestions();
    }

    @GetMapping("/unique")
    public List<GuestSuggestionEntity> getUniqueSuggestions() {
        return suggestionService.findAllUniqueSuggestions();
    }


}
