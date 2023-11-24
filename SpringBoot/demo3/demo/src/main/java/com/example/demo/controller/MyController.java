package com.example.demo.controller;

import com.example.demo.Account;
import com.example.demo.Current;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private Current current;
@Autowired
    public MyController(Current current) {
        this.current = current;
    }
}









