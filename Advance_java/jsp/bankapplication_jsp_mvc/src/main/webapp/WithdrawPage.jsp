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
<jsp:setProperty name="login" property="userId" param="session.getAttribute(LoginSessionId)"/>
<jsp:setProperty name="login" property="balance" param="amtw"/>

<%
    try {
        ServiceBankApplication serviceBankApplication = new ServiceBankApplication();

        int result = serviceBankApplication.WithdrawAmount(login);
        out.println("YOUR AMOUNT WITHDRAW SUCCESSFULLY");
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
