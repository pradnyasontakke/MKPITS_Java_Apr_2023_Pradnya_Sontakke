<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/6/2023
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>homepage</title>
    <style>
        nav{
            display: flex;
            align-items: center;
            background: aliceblue;
            height: 200px;
        }
        nav ul li{
            display: inline-block;
            list-style: none;
        }
        nav ul li a{
            text-decoration: none;
            color:blueviolet;

        }

        body{
            background: lightgray;
            border:ridge 10px brown ;
            width: 500px;
            /*          height: 200px;*/
            margin-left: 400px;
            margin-top: 200px;

        }

        a{
            display: inline-block;
            margin:10px 10px;
        }
        h1{
            color: darkred;
            background:  aliceblue;

        }
    </style>
</head>
<body>

<center>   <h1>...WELCOME...</h1></center>

<CENTER> <nav>

    <ul>
        <li><a href="Depositpage.html">DEPOSIT</a></li>
        <li><a href="Withdraw.html">WITHDRAW</a></li>
        <li><a href="transferPage.jsp">TRANSFER</a></li>
        <li><a href="">STATEMENT</a></li>
        <li><a href="">LOGOUT</a></li>
    </ul>
</nav></center>
</body>
</html>









