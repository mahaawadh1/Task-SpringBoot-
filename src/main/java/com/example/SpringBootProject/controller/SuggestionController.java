package com.example.SpringBootProject.controller;
import com.example.SpringBootProject.bo.CreateSuggestionRequest;
import com.example.SpringBootProject.service.GuestSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuggestionController {
    @Autowired
    private GuestSuggestionService suggestionService;

    @PostMapping("/api/suggestions")
    public String receiveAndProcessSuggestion(@RequestBody CreateSuggestionRequest request) {
        suggestionService.printAndProcessSuggestion().processSuggestion(request.getSuggestionText());
        return "Suggestion received and processed successfully.";
    }
}
