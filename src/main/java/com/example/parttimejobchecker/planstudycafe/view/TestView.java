package com.example.parttimejobchecker.planstudycafe.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestView {
    @GetMapping("/")
    public String hello() {
        return "Hello Super Coding World";
    }
}

