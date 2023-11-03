<%--//when we can create mvc in our project then we have to divide project in 4 steps.--%>
<%--//first one is index page that is our view page(index.html)--%>
<%--//second one is for the insert the data this is our model  here we can write our jsp code (InsertData)--%>
<%--//third one is the simple java class here we can call default constructor and setter getter methods(StudentData)--%>
<%--//last one is the service method this is our controller here we can do the connectivity (ServiceStudentdata)--%>


<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="InsertData.jsp">
<label>Name</label>
<input type="text" name="nm" >
<label>City</label>
<input type="text" name="ct">
<input type="submit" name="sm" value="submit">
<%--<a href="hello-servlet">Hello Servlet</a>--%>

</form>
</body>
</html>