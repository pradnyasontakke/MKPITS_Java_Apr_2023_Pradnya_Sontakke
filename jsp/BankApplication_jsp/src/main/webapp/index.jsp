<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="LoginPage" method="">
    <table align="" cellpadding="2" cellspacing="10" border="0">
        <tr>
            <td><label>USER ID</label></td>
            <td><INPUT type="text" name="uid" placeholder="user_id"></td></tr>

           <tr> <td><label>PASSWORD</label></td>
            <td><INPUT type="text" name="pw" placeholder="password"></td>
        </tr>

    </table>
</form>
<table>
    <tr>
        <td><input type="submit" value="LOG IN"></td>

    </tr>

    <tr>
        <td  align="center">NEW USER<a href="regishtration.jsp"> SIGN_UP</a></td>

    </tr></table>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
</body>
</html>