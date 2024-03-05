package com.example.hellospringai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromptController {

    @GetMapping("/prompt")
    public String prompt() {
        return "Hello, Spring AI!";
    }
}
