<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>login page</title>
    <style>
        h1{
            color: darkred;
        }
        body{
            background-color: azure;
        }
        form{
            border: 3px solid darkred ;
            text-align: center;
            width: 500px;
            background: lightslategray;
            margin-top: 150px;
            margin-left: 400px;

        }
    </style>
</head>
<body>
<form action="Login.jsp" method="post">
    <h1>...LOGIN HERE...</h1>
    <center><table>
    <tr>
        <td><B><label>USER ID</label></B></td>
        <td><input type="text" name="uid"></td>
    </tr>
    <tr>
        <td><B><label>PASSWORD</label></B></td>
        <td><input type="text" name="pw"></td>
    </tr>

    <tr>
        <td><input type="submit" name="am" value="SUBMIT"></td>
        <td><input type="reset" name="res"></td>
    </tr>
    <tr>
        <td><h4>new user</h4></td>
        <td><a href="Regishtration.jsp"><h4>sign up</h4></a></td>
    </tr>
</table></center>
</form>
</body>
</html>