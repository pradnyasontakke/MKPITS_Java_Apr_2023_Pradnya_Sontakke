package com.example.bankapplication_jsp_mvc;

import java.sql.*;

import static java.lang.System.out;
public class ServiceBankApplication {
    Connection connection;

    public ServiceBankApplication() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Application", "root", "root");
    }

    public ResultSet InsertDataLogin(BankAppUserDataJava bankAppUserDataJava) {//object of java class

        ResultSet resultSet = null;   //interface ResultSet
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Registration where userId=?and password=?");
            preparedStatement.setString(1, bankAppUserDataJava.getUserId());
            preparedStatement.setString(2, bankAppUserDataJava.getPassword());

            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            out.println(e);
        }
        return resultSet;
    }

    public int InsertData(BankAppUserDataJava bankAppUserDataJava) {

        int resultSet = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Registration values(?,?,?,?,?,?,?)");
            preparedStatement.setString(1, bankAppUserDataJava.getUserId());
            preparedStatement.setString(2, bankAppUserDataJava.getPassword());
            preparedStatement.setString(3, bankAppUserDataJava.getName());
            preparedStatement.setString(4, bankAppUserDataJava.getAddress());
            preparedStatement.setString(5, bankAppUserDataJava.getCity());
            preparedStatement.setString(6, bankAppUserDataJava.getEmail());
            preparedStatement.setString(7, bankAppUserDataJava.getBalance());
            resultSet = preparedStatement.executeUpdate();
        } catch (Exception e) {
            out.println(e);
        }
        return resultSet;
    }


    public int DepositAmount(BankAppUserDataJava dep) {
        int resultSet=0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update  Registration set balance=balance+? where userId=?");
            preparedStatement.setString(1,dep.getBalance());
            preparedStatement.setString(2,dep.getUserId());
            resultSet=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("e");
        }return resultSet;
    }

    public int WithdrawAmount(BankAppUserDataJava wit){

        int returnwith =0;
        try {
            PreparedStatement preparedStatement=connection.prepareStatement("update Registration set balance=balannce+? where userId=?");
            preparedStatement.setString(1,wit.getBalance());
            preparedStatement.setString(2, wit.getUserId());
            returnwith= preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return returnwith;
    }
}
