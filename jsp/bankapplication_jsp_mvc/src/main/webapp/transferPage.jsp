<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/17/2023
  Time: 10:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="transferamt" class="com.example.bankapplication_jsp_mvc.TransactionJava" scope="application"/>




<jsp:setProperty name="transferamt" property="transactionType2" value="transfer_in"/>
<jsp:setProperty name="transferamt" property="userId" param="transferid"/>
<jsp:setProperty name="transferamt" property="depositAmount" param="transferamount"/>
<jsp:setProperty name="transferamt" property="transactionDate" param="session.getCreationTime()"/>


<jsp:useBean id="login" class="com.example.bankapplication_jsp_mvc.TransactionJava" scope="application"/>
<jsp:setProperty name="login" property="user_id" param="session.getAttribute(uid)"/>
<jsp:setProperty name="login" property="typetransfer" value="transfer_out"/>
<jsp:setProperty name="login" property="transferdate" param="session.getCreationTime()" />
<jsp:setProperty name="login" property="amount" param="transferamount"/>





<%

    ServiceStudent amttransfer=new ServiceStudent();
    amttransfer.transfer(transferamt);
    amttransfer.transferupdate(login);

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
