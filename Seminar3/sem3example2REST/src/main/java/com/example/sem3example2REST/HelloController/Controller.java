package com.example.sem3example2REST.HelloController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/hello")
    public String hello()
    {return "Hallo!";}

    @GetMapping("/ciao")
    public String ciao()
    {return "Ciao!";}
}
