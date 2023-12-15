package com.example.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SavingAccount implements Account {

    public SavingAccount() {
        System.out.println("saving lazy");   //create constructor for lazy
    }

    @Override
    public String getDetails() {

        return "this is saving account";
    }
}

