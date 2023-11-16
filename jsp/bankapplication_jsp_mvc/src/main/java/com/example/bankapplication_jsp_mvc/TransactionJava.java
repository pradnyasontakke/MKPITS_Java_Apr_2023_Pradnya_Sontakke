package com.example.bankapplication_jsp_mvc;

import java.sql.Date;

public class TransactionJava {
    private String loginUserId;
    private String transferUserId;
    private Date TransactionIn;
    private double Amount;
    private String transactionTypeIn;
    private String transactionTypeOut;


    public TransactionJava(){
    }

    public TransactionJava(String loginUserId, String transferUserId, Date transactionIn, double amount, String transactionTypeIn, String transactionTypeOut) {
        this.loginUserId = loginUserId;
        this.transferUserId = transferUserId;
        TransactionIn = transactionIn;
        Amount = amount;
        this.transactionTypeIn = transactionTypeIn;
        this.transactionTypeOut = transactionTypeOut;
    }

    public String getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(String loginUserId) {
        this.loginUserId = loginUserId;
    }

    public String getTransferUserId() {
        return transferUserId;
    }

    public void setTransferUserId(String transferUserId) {
        this.transferUserId = transferUserId;
    }

    public Date getTransactionIn() {
        return TransactionIn;
    }

    public void setTransactionIn(Date transactionIn) {
        TransactionIn = transactionIn;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public String getTransactionTypeIn() {
        return transactionTypeIn;
    }

    public void setTransactionTypeIn(String transactionTypeIn) {
        this.transactionTypeIn = transactionTypeIn;
    }

    public String getTransactionTypeOut() {
        return transactionTypeOut;
    }

    public void setTransactionTypeOut(String transactionTypeOut) {
        this.transactionTypeOut = transactionTypeOut;
    }
}
