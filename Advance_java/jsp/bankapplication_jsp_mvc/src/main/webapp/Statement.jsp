<%@ page import="com.example.bankapplication_jsp_mvc.ServiceBankApplication" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/19/2023
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="login" class="com.example.bankapplication_jsp_mvc.BankAppUserDataJava" scope="application"/>
<jsp:setProperty name="login" property="userId" param="session.getAttribute(LoginSessionId)"/>
<%
    try {
        ServiceBankApplication serviceBankApplication = new ServiceBankApplication();
        ResultSet resultSet = serviceBankApplication.statement(login);
    } catch (Exception e) {
        out.println(e);
    }
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
