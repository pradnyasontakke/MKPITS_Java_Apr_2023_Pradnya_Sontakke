<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/2/2023
  Time: 12:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
try
{
<%
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentMVC", "root", "root");
    Statement statement= connection.createStatement();
    ResultSet resultSet= statement.executeQuery("select * from Stud_data");   //we want to display data so write select query
    ResultSetMetaData resultSetMetaData= resultSet.getMetaData();      //  ResultSetMetaData is interface and getMetaData is method

%>
} catch (SQLException e) {
throw new RuntimeException(e);
}
<html>
<head>
    <title>TABLE</title>
</head>
<body>

<table border="2" align="center" cellpadding="2" cellspacing="3">
    <tr>
    <h1>DATA_TABLE</h1></tr>
    <tr>
        <%
           for(int columnIndex=1;columnIndex<=resultSetMetaData.getColumnCount();columnIndex++)
           {
        %>
        <th> <%= resultSetMetaData.getColumnName(columnIndex)%> </th>
       <%
           }
       %>
    </tr>
        <%
            while (resultSet.next())
            {
        %>
        <tr>
        <td> <%= resultSet.getString(1)%></td>
        <td> <%= resultSet.getString(2)%></td>
        </tr>
    <%
        }
    %>
</table>
</body>
</html>
