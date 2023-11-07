package com.example.bankapplication_jsp_mvc;

public class BankAppUserDataJava {
    private String userId;
    private String password;
    private String name;
    private String address;
    private String city;
    private String email;
    private String balance;


    public BankAppUserDataJava(){}

    public BankAppUserDataJava(String userId, String password, String name, String address, String city, String email, String balance) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.address = address;
        this.city = city;
        this.email = email;
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getBalance() {
        return  balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}