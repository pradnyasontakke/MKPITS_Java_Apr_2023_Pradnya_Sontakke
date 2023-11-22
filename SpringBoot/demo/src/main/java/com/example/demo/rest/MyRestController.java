package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @Value("${pradnya-name}")

    private String name;
    @GetMapping("/")  //end point
    public String display(){
        return "Hiii"+" "+name;
    }
}
