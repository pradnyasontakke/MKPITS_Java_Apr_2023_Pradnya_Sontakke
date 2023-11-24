package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class CurrentAccount implements Account {

//    public CurrentAccount() {
//        System.out.println("current lazy");
//    }
//
    @Override
    public String getDetails() {
        return "This is current account";
    }



    @PostConstruct
    public void startup(){
        System.out.println("start up"+getClass().getSimpleName());
    }

    @PreDestroy
    public void enddown(){
        System.out.println("end work down");
    }
}
