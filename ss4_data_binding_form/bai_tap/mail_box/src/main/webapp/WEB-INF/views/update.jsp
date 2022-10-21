<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 03/10/2022
  Time: 4:37 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Display Page</title>
</head>
<body>
<fieldset>
    <legend>Email</legend>
    <table>
        <tr>
            <td>Language :</td>
            <td>${email.language}</td>
        </tr>
      <tr>
            <td>Page Size :</td>
            <td>${email.pageSize}</td>
        </tr>
      <tr>
            <td>Spam Filter: :</td>
            <td>${email.spamFilter}</td>
        </tr>
      <tr>
            <td>Signature :</td>
            <td>${email.signature}</td>
        </tr>
    </table>


</fieldset>
</body>
</html>
