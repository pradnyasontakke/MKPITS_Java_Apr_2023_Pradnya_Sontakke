<%@ page import="com.example.bankapplication_jsp_mvc.ServiceBankApplication" %>
<%@ page import="javax.xml.transform.Result" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/7/2023
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="login" class="com.example.bankapplication_jsp_mvc.BankAppUserDataJava" scope="application"/>
<jsp:setProperty  name="login" property="userId" param="session.getAttribute(uid)"/>
<jsp:setProperty  name="login" property="balance" param="amt"/>


    <%
        ServiceBankApplication serviceBankApplication=new ServiceBankApplication();
       int  Result=serviceBankApplication.DepositAmount(login);
        System.out.println("<h1>your amount deposited</h1>");
    %>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
