<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/5/2023
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.bankapplication_jsp_mvc.ServiceBankApplication" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="static java.lang.System.out" %>
<%@ page import="static java.lang.System.out" %>
<jsp:useBean id="login" class="com.example.bankapplication_jsp_mvc.BankAppUserDataJava" scope="application"/>


<jsp:setProperty name="login" property="userId" param="uid"/>
<jsp:setProperty name="login" property="password" param="pw"/>

<%--<jsp:getProperty name="login" property="userId"/>--%>
<%--<jsp:getProperty name="login" property="password"/>--%>
<%
try{

    ServiceBankApplication serviceBankApplication=new ServiceBankApplication();  //object of service class(controller)
    ResultSet resultSet=serviceBankApplication.InsertDataLogin(login);

     if(resultSet.next())   // used to get the input from the user.
     {
           System.out.println("Successfully login");
           request.getSession(true);
           session.setAttribute("LoginSessionId",login.getUserId());

        }
        else
        {
            System.out.println("Incorrect login ");
//            System.out.println("<a href='index.jsp'>Log In</a>");
//                   out.println("submitted");
        }
    }catch(Exception e)
       {
        System.out.println(e);
       }
%>



<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>login successfully</h1>
</body>
</html>
