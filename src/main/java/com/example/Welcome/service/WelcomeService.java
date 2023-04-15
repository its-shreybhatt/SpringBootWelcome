package com.example.Welcome.service;


import com.example.Welcome.dto.WelcomeClass;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public WelcomeClass getWelcomeMessage() {
        return new WelcomeClass("Welcome to Spring Boot Demo");
    }
}
