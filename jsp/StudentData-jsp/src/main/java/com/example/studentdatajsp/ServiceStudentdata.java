package com.example.studentdatajsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServiceStudentdata {
    Connection connection;

    public ServiceStudentdata() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentMVC", "root", "root");

    }

    public int InsertData(StudentData studentData) {
        int result=0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Stud_data values(?,?)");
            preparedStatement.setString(1, studentData.getName());
            preparedStatement.setString(2, studentData.getCity());
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}