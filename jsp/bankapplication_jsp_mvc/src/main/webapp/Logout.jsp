<%@ page import="java.io.IOException" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/19/2023
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="login" scope="application" class="com.example.bankapplication_jsp_mvc.BankAppUserDataJava"/>
<jsp:setProperty name="login" property="userId" param="session.getAttribute(LoginSessionId)"/>
<%
    try{
    session.setAttribute("userId",null);
   String userid=(String) session.getAttribute("userId");
   if (userid==null){
       RequestDispatcher requestDispatcher= request.getRequestDispatcher("index.jsp");
       requestDispatcher.forward(request,response);
   }
        out.println("...You are logout...");
    } catch (ServletException e) {
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


