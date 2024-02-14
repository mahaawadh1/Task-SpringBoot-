package com.example.SpringBootProject.bo;

public class LoginResponse {

    private String token;

    public LoginResponse(String token) {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
