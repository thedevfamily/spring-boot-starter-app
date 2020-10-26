package com.thedevfamily.usermanagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    @RequestMapping("/")
    public String greeting() {
        return "Greetings from The Dev Family";
    }
}
