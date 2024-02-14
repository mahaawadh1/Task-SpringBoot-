package com.example.SpringBootProject.service;

import com.example.SpringBootProject.entitiy.GuestSuggestionEntity;
import com.example.SpringBootProject.enums.SuggestionStatus;
import com.example.SpringBootProject.repositry.GuestSuggestionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GuestSuggestionServiceTest {

    @Mock
    private GuestSuggestionRepository repository;

    @InjectMocks
    private GuestSuggestionService suggestionService;

    @Test
    void whenGetCreateStatusSuggestions_thenSuccess() {

        GuestSuggestionEntity suggestion1 = new GuestSuggestionEntity();
        suggestion1.setStatus(SuggestionStatus.CREATE);
        GuestSuggestionEntity suggestion2 = new GuestSuggestionEntity();
        suggestion2.setStatus(SuggestionStatus.REMOVE);
        when(repository.findByStatus(SuggestionStatus.CREATE)).thenReturn(Arrays.asList(suggestion1, suggestion2));

        List<GuestSuggestionEntity> result = suggestionService.getCreateStatusSuggestions();


        assertEquals(1, result.size());
        assertEquals(SuggestionStatus.CREATE, result.get(0).getStatus());
    }

    @Test
    void whenGetRemoveStatusSuggestions_thenSuccess() {

        GuestSuggestionEntity suggestion1 = new GuestSuggestionEntity();
        suggestion1.setStatus(SuggestionStatus.CREATE);
        GuestSuggestionEntity suggestion2 = new GuestSuggestionEntity();
        suggestion2.setStatus(SuggestionStatus.REMOVE);
        when(repository.findByStatus(SuggestionStatus.REMOVE)).thenReturn(Arrays.asList(suggestion2));

        // Act
        List<GuestSuggestionEntity> result = suggestionService.getRemoveStatusSuggestions();

        // Assert
        assertEquals(1, result.size());
        assertEquals(SuggestionStatus.REMOVE, result.get(0).getStatus());
    }
}
