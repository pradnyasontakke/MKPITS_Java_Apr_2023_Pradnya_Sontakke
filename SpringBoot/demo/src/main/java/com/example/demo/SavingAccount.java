package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SavingAccount implements Account {

    public SavingAccount() {
        System.out.println("saving lazy");   //create constructor for lazy
    }

    @Override
    public String getDetails() {

        return "this is saving account";
    }
}

