<%--total summary of this project1
when we create jsp project then automaticaly create servlet.java and index.jsp
in index.jsp page write the input field as same in we create in database
create next servlet page for the insert data name is that JSPDataInsert.jsp
 in this page we write code for the insert the data
 get the data using request.getParameter method
 driver loaded and connection istablish
 set the values using   preparedStatement.setString
 after that for insert data create one variable and insert data using executeUpdate
 write code for the check matching data
 in html write anchor tag and give the dispay table link

 then create second jsp page for the display data name is DisplayTable.jsp
  write connection code and write interface ResultSetMetaData
  in html code write for loop for the column heading
  write while loop for the taking next values--%>


<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>login </title>
    <style>

            form{
                text-align: center;
                border-style: solid;
                width: 500px;
                background: lightgray;
            }
            h1{color: brown;}

    </style>
</head>
<body>

<form action="JSPDataInsert.jsp" METHOD="post">
    <h1>LOGIN HERE</h1><br><br><BR>
    <label>NAME</label>
    <input type="text" name="name"><br><br>
    <label>CITY</label>
    <input type="text" name="city"><br><br>
    <input type="SUBMIT" name="sbmt">
    <input type="reset" name="rst"><br><br><br><br>

</form>
</body>
</html>