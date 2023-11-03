<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>login page</title>
    <style>
        form{
            border: 2px solid darkred ;
            text-align: center;
        }
    </style>
</head>
<body>
<form action="login" method="post">
<table>
    <tr>
        <td><label>USER ID</label></td>
        <td><input type="text" name="uid"></td>
    </tr>
    <tr>
        <td><label>PASSWORD</label></td>
        <td><input type="text" name="pw"></td>
    </tr><br>

    <tr>
        <td><input type="submit" name="am" value="SUBMIT"></td>
        <td><input type="reset" name="res"></td>
    </tr>
    <tr>
        <td><h4>new user</h4></td>
        <td><h4>sign up</h4></td>
    </tr>
</table>
</form>
</body>
</html>