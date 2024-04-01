package com.example.Example1Seminar4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

    @RequestMapping("/about")
    public String about() {
        return "about.html";
    }

}
