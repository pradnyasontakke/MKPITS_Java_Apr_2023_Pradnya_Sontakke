<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/4/2023
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>

    <style>
        form{
            text-align: center;
            border-style: solid;
            width: 500px;
            background: lightgray;
            margin-top: 200px;
            margin-left: 400px;
       }
        h1{color: brown}
        tr{
            margin-left: 100px;
        }
        body{
            background-color: azure;
        }

    </style>
</head>
    <form action="Registrationjsp.jsp" method="post">
<h1>...REGISTERED HERE...</h1>
        <center> <table>
        <tr>
            <td><b><label>USER ID</label> </b></td>
            <td><input type="text" name="uid" placeholder="USER_ID"></td>
        </tr>
        <tr>
            <td><b><label>PASSWORD</label> </b></td>
            <td><input type="text" name="pw" placeholder="password"></td>
        </tr>
        <tr>
            <td><b><label>NAME</label> </b></td>
            <td><input type="text" name="nm"></td>
        </tr>
        <tr>
            <td><b><label>ADDRESS</label></b> </td>
            <td><input type="text" name="add"></td>
        </tr>
        <tr>
            <td><b><label>CITY</label></b> </td>
            <td><input type="text" name="ct"></td>
        </tr>
        <tr>
            <td><b><label>EMAIL ID</label> </b></td>
            <td><input type="text" name="eid"></td>
        </tr>
        <tr>
            <td><b><label>BALANCE</label></b> </td>
            <td><input type="text" name="bal"></td>
        </tr>
        <tr>
            <td><b><input type="submit" name="sbmt" value="SUBMIT"></b></td>
            <td><b><input type="reset" name="rst" value="RESET"></b></td>
        </tr>

   </table> </center><br><br></form>



<body>

</body>
</html>
