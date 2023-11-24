package com.example.demo;

import jakarta.annotation.PreDestroy;

public class Current implements Account{
    @Override
    public String getdetails() {
        return "this is current account";
  }
  @PostConstructor
    public void startdown(){
        System.out.println("start up"+getClass().getSimpleName());
    }
    @PostConstructor
    public void startup(){
        System.out.println("start up"+getClass().getSimpleName());
    }
    @PreDestroy
    public void endwork(){
        System.out.println("end work");
    }
    @PreDestroy
    public void enddown(){
        System.out.println("end work down");
    }
}
