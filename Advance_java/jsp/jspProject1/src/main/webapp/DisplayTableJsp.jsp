        <%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/2/2023
  Time: 12:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    ResultSetMetaData resultSetMetaData;
    ResultSet resultSet;
    try {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentMVC", "root", "root");
        Statement statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from Stud_data");
        resultSetMetaData = resultSet.getMetaData();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
%>

<html>
<head>
    <title>TABLE</title>
</head>
<body>

<table border="3" align="center" cellpadding="10" cellspacing="3">

    <tr>
        <%
            for (int columnIndex = 1; columnIndex <= resultSetMetaData.getColumnCount(); columnIndex++) {
        %>
        <th> <%=resultSetMetaData.getColumnName(columnIndex)%> </th>
       <%
           }
       %>
    </tr>
        <%
            while (resultSet.next()) {
        %>
        <tr>
        <td> <%=resultSet.getString(1)%></td>
        <td> <%=resultSet.getString(2)%></td>
        </tr>
    <%
        }
    %>

</table>
</body>
</html>
