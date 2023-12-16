<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/5/2023
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%@ page import="com.example.bankapplication_jsp_mvc.ServiceBankApplication" %>
<jsp:useBean id="registereUserdata" class="com.example.bankapplication_jsp_mvc.BankAppUserDataJava" scope="application"/>


<jsp:setProperty name="registereUserdata" property="userId" param="uid"/>
<jsp:setProperty name="registereUserdata" property="password" param="pw"/>
<jsp:setProperty name="registereUserdata" property="name" param="nm"/>
<jsp:setProperty name="registereUserdata" property="address" param="add"/>
<jsp:setProperty name="registereUserdata" property="city" param="ct"/>
<jsp:setProperty name="registereUserdata" property="email" param="eid"/>
<jsp:setProperty name="registereUserdata" property="balance" param="bal"/>

<%--<jsp:getProperty name="registereUserdata" property="userId"/>--%>
<%--<jsp:getProperty name="registereUserdata" property="password"/>--%>
<%--<jsp:getProperty name="registereUserdata" property="name"/>--%>
<%--<jsp:getProperty name="registereUserdata" property="address"/>--%>
<%--<jsp:getProperty name="registereUserdata" property="city"/>--%>
<%--<jsp:getProperty name="registereUserdata" property="email"/>--%>
<%--<jsp:getProperty name="registereUserdata" property="balance"/>--%>




<%
    try{
        ServiceBankApplication serviceBankApplication=new ServiceBankApplication();

        int resultSet=serviceBankApplication.InsertData(registereUserdata);
        if(serviceBankApplication.InsertData(registereUserdata)!=0)
        {
            System.out.println("insert data successfully");
        }else {
           System.out.println(" data not inserted successfully");
        }
    }
    catch(Exception e){System.out.println(e);
    }
%>

<a  href="index.jsp">

</a>

<html>
<head>
    <title>registration</title>
</head>
<body>

</body>
</html>
