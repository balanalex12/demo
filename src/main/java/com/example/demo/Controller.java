package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String test() {
        return "De ce esti rupt in pizda? Imi poti explica?";
    }
}
