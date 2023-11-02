
<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/1/2023
  Time: 8:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.io.PrintWriter" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="jdk.internal.icu.impl.CharacterIteratorWrapper" %>
<%

    String nm = request.getParameter("name");
    String ct = request.getParameter("city");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentMVC", "root", "root");
         PreparedStatement preparedStatement = connection.prepareStatement("insert into Stud_data values(?,?)");

         preparedStatement.setString(1, nm);
        preparedStatement.setString(2, ct);

        int result = preparedStatement.executeUpdate();     //we store result in int data type because of result show in true false format means if
                                                           // if we put data in right format then got msg true means successful or false unsuccessful
        if (result != 0) {             //check data match
            out.println(" data inserted");
        } else {
            out.println(" data not inserted");
        }
    } catch (Exception e) {

        out.println(e);
    }
%>

<html>
<head>
    <title>Data Insert</title>
</head>
<body>

<a href="DisplayTableJsp.jsp"> Display your Student details Table</a>    //link for the display data
</body>
</html>
