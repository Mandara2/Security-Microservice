package com.rml.security.GoogleOAuth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoogleController {
    @GetMapping("/")
    public String greet() {
        return "Welcome!";
    }
}
