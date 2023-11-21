<%@ page import="com.example.bankapplication_jsp_mvc.ServiceBankApplication" %>
<%@ page import="javax.xml.transform.Result" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/7/2023
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="login" class="com.example.bankapplication_jsp_mvc.BankAppUserDataJava" scope="application"/>
<jsp:setProperty  name="login" property="userId" param="session.getAttribute(LoginSessionId)"/>
<jsp:setProperty  name="login" property="balance" param="amt"/>


    <%
        try {
            ServiceBankApplication serviceBankApplication = new ServiceBankApplication();
            int Result = serviceBankApplication.DepositAmount(login);
            out.println("YOUR AMOUNT DEPOSITED");
        } catch (Exception  e) {
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
