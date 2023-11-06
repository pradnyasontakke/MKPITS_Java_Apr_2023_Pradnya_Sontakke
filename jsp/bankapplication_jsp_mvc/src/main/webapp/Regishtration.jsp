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
    <form action="Registrationjsp.jsp" method="post">
    <table>
        <tr>
            <td><label>USER ID</label> </td>
            <td><input type="text" name="uid" placeholder="USER_ID"></td>
        </tr>
        <tr>
            <td><label>PASSWORD</label> </td>
            <td><input type="text" name="pw" placeholder="password"></td>
        </tr>
        <tr>
            <td><label>NAME</label> </td>
            <td><input type="text" name="nm"></td>
        </tr>
        <tr>
            <td><label>ADDRESS</label> </td>
            <td><input type="text" name="add"></td>
        </tr>
        <tr>
            <td><label>CITY</label> </td>
            <td><input type="text" name="ct"></td>
        </tr>
        <tr>
            <td><label>EMAIL ID</label> </td>
            <td><input type="text" name="eid" placeholder="EMAIL_ID"></td>
        </tr>
        <tr>
            <td><label>BALANCE</label> </td>
            <td><input type="text" name="bal"></td>
        </tr>
        <tr>
            <td><input type="submit" name="sbmt" value="SUBMIT"></td>
        </tr>
        <tr>
            <td><input type="reset" name="rst" value="RESET"></td>
        </tr>

    </table></form>


</head>
<body>

</body>
</html>
