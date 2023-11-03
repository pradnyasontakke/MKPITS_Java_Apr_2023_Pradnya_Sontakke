<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/2/2023
  Time: 10:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*"%>

<%
    String user=request.getParameter("uid");
    String password=request.getParameter("pw");
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Application", "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from Registration where userID=? and password=?");

        preparedStatement.setString(1, user);
        preparedStatement.setString(2, password);
        ResultSet resultSet=preparedStatement.executeQuery();

        if(resultSet.next()){
            out.println("Successfully login");


            //get user id using session trcking
            HttpSession httpsession=request.getSession(true);
            httpsession.setAttribute("f",user);



            RequestDispatcher sendrequest=request.getRequestDispatcher("Homepage.html");
            sendrequest.forward(request, response);
        }
        else{
            out.println("Incorrect Password ");
        }

    }catch(Exception e){
        out.println(e);
    }
%>







<html>
<head>
    <title>login</title>
</head>
<body>

</body>
</html>
