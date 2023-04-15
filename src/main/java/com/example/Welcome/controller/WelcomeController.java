package com.example.Welcome.controller;

import com.example.Welcome.dto.WelcomeClass;
import com.example.Welcome.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    @GetMapping(value = "getWelcome")
    public WelcomeClass getWelcome() {
        return welcomeService.getWelcomeMessage();
    }
}
