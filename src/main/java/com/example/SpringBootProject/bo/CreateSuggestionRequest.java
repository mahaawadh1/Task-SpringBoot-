package com.example.SpringBootProject.bo;

public class CreateSuggestionRequest {
    private String suggestionText;
    private int rate;


    public String getSuggestionText() {
        return suggestionText;
    }

    public void setSuggestionText(String suggestionText) {
        this.suggestionText = suggestionText;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
