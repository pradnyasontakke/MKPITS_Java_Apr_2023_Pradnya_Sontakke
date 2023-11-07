<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/7/2023
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DEPOSIT</title>

    <style>
        form{
        text-align: center;
        border-style: solid;
        width: 500px;
        background: lightgray;
        margin-top: 200px;
        height: 200px;
               }
    h1{color: brown}
    </style>
</head>
<body><center>
<form action="Depositejsp.jsp" method="post">
    <h1>DEPOSIT PAGE</h1><br>
    <label>Amount</label>
    <input type="text" name="amt"><br><br>
    <input type="submit" name="submit" value="deposit">
</form></center>
</body>
</html>
