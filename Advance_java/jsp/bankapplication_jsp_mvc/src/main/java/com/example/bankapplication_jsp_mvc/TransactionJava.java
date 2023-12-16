package com.example.bankapplication_jsp_mvc;

import java.sql.Date;

public class TransactionJava {
    private String UserId;
    private Date transactionDate;
    private int Amount;
    private String transferUserId;
    private String transactionTypeIn;
    private String transactionTypeOut;

    public TransactionJava(){}

    public TransactionJava(String userId, Date transactionDate, int amount, String transferUserId, String transactionTypeIn, String transactionTypeOut) {
        UserId = userId;
        this.transactionDate = transactionDate;
        Amount = amount;
        this.transferUserId = transferUserId;
        this.transactionTypeIn = transactionTypeIn;
        this.transactionTypeOut = transactionTypeOut;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public String getTransferUserId() {
        return transferUserId;
    }

    public void setTransferUserId(String transferUserId) {
        this.transferUserId = transferUserId;
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
