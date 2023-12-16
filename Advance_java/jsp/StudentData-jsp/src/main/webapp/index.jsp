<%--//when we can create mvc in our project then we have to divide project in 4 steps.--%>
<%--//first one is index page that is our view page(index.html)--%>
<%--//second one is for the insert the data this is our model  here we can write our jsp code (InsertData)--%>
<%--//third one is the simple java class here we can call default constructor and setter getter methods(StudentData)--%>
<%--//last one is the service method this is our controller here we can do the connectivity (ServiceStudentdata)--%>


<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>LOGIN PAGE</title>
    <STYLE>
        form{
            text-align: center;
            border: solid darkred 2px;
            background-size: 500px;
            box-shadow: red;
            width: 500px;
        }
    </STYLE>
</head>
<body>
<center>
<form action="InsertData.jsp">
    <h1>LOGIN HERE </h1>
<label>Name</label>
<input type="text" name="nm" ><br><br>
<label>City</label>
<input type="text" name="ct"><br><br>
<input type="submit" name="sm" value="submit"><br>
</form></center>
</body>
</html>