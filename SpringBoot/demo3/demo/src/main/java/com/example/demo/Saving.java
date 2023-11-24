package com.example.demo;

public class Saving implements Account{
    @Override
    public String getdetails() {

        return "this is saving account";
    }
    @PostConstructor
    public void startwork(){
        System.out.println("this is startwork");
    }
}
