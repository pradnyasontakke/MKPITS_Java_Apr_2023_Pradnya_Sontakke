<%@ page import="com.example.bankapplication_jsp_mvc.ServiceBankApplication" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/17/2023
  Time: 10:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="transferamt" class="com.example.bankapplication_jsp_mvc.TransactionJava" scope="application"/>




<jsp:setProperty name="transferamt" property="transactionTypeOut"/>
<jsp:setProperty name="transferamt" property="userId" param="transferuid"/>
<jsp:setProperty name="transferamt" property="Amount" param="transferamt"/>
<jsp:setProperty name="transferamt" property="transactionDate" param="session.getCreationTime()"/>





<%
    try {
        ServiceBankApplication serviceBankApplication = new ServiceBankApplication();

    } catch (SQLException e) {
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







