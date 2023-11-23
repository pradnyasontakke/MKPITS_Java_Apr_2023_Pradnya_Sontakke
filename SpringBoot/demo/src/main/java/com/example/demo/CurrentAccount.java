package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class CurrentAccount implements Account {

    public CurrentAccount() {
        System.out.println("current lazy");
    }

    @Override
    public String getDetails() {
        return "This is current account";
    }
}
