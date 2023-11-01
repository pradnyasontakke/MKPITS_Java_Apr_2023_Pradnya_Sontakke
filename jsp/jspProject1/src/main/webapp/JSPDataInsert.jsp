
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
<%
    String nm=request.getParameter("name");
    String ct=request.getParameter("city");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentMVC", "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement("insert into transaction values(?,?)");        preparedStatement.setString(1, nm);



        preparedStatement.setString(2, ct);
        int result = preparedStatement.executeUpdate();
        PrintWriter printWriter = response.getWriter();
        if (result != 0) {
            printWriter.println(" data inserted");
        } else {
            printWriter.println(" data not inserted");
        }
    }

    catch(Exception e){
        PrintWriter printWriter = response.getWriter();

        printWriter.println(e);
    }
%>

<html>
<head>
    <title>Data Insert</title>
</head>
<body>

</body>
</html>
