<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/3/2023
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%@ page import="com.example.studentdatajsp.ServiceStudentdata" %>
<jsp:useBean id="stud" class="com.example.studentdatajsp.StudentData" scope="application"/>

<jsp:setProperty name="stud" property="name" param="nm"/>
<jsp:setProperty name="stud" property="city" param="ct"/>

<jsp:getProperty name="stud" property="name"/>
<jsp:getProperty name="stud" property="city"/>
<%
    try {
        ServiceStudentdata serviceStudentdata = new ServiceStudentdata();
        serviceStudentdata.InsertData(stud);
        if (serviceStudentdata.InsertData(stud) != 0) {
            out.println("data inserted");

        } else {
            out.println("data inserted");
        }
    }catch (Exception e){
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
