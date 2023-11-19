<%@ page import="com.example.bankapplication_jsp_mvc.ServiceBankApplication" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/17/2023
  Time: 10:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="login" scope="application" class="com.example.bankapplication_jsp_mvc.BankAppUserDataJava"/>
<jsp:setProperty name="login" property="userId" param="session.getAttribute(uid)"/>
<jsp:setProperty name="login" property="balance" param="amt"/>


<%
    try {
        ServiceBankApplication serviceBankApplication = new ServiceBankApplication();

        int result = serviceBankApplication.WithdrawAmount(login);
    } catch (Exception e) {
        System.out.println(e);
    }
    System.out.println("<h1>YOUR AMOUNT WITHDRAW SUCCESSFULLY</h1>");
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
