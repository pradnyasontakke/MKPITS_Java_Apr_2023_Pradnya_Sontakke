package com.example.demo.rest;

import com.example.demo.Account;
import com.example.demo.CurrentAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
//    private Account account;  //scan automatically and inject
//
//
//
//    public void setAccount(Account account) {           //setter injection
//        this.account = account;
//    }
//    @GetMapping("/s")
//    public String showset() {
//        return account.getDetails();
//    }




//    public MyRestController (@Qualifier("savingAccount") Account account) {
//        this.account = account;       //savingAccount is beanid of saving account class   23/11/23
//    }
//    @GetMapping("/c")
//    public String show() {
//        return account.getDetails();
//    }
//
//
//
//    ////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\22/11/23
//    @Value("${pradnya-name}")
//
//    private String name;
//    @GetMapping("/")  //end point
//    public String display(){
//        return "Hiii"+" "+name;
//    }
//
//
///////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\scope
//    //@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) write annotation in current class
//
//    private Account account1, account2;
//    @Autowired
//    public MyRestController (@Qualifier("savingAccount") Account account1,@Qualifier("savingAccount") Account account2)
//    {
//        this.account1 = account1;
//        this.account2 = account2;
//    }
//    @GetMapping("/beanscope")
//    public boolean show1() {
//        return account1==account2;
//    }
//
//
//
//

///////////////////=\\\\\\\\\\\\\\\\\\\\\\
//    scope bean

    private CurrentAccount currentAccount;
    @Autowired
    public MyRestController(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }



}
