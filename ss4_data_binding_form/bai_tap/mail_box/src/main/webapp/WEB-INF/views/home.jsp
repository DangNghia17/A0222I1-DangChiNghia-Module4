<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 03/10/2022
  Time: 4:37 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>HomePage Email</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>
</head>
<body> <fieldset>
    <legend>Email</legend>
<form:form action="/update" method="post" modelAttribute="createEmail">

        <table>
            <tr>
                <td><form:label path="language">Language :</form:label></td>
                <td><form:select path="language" items="${language}"></form:select></td>
            </tr>
            <tr>
                <td><form:label path="pageSize">Page Size :</form:label></td>
                <td><form:label path="pageSize">Show</form:label>
                    <form:label path="pageSize">emails per page</form:label>
                    <form:select path="pageSize" items="${language}"></form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="spamFilter">Spam Filter :</form:label></td>
                <td><form:label path="spamFilter">Enable spams filter</form:label>
                    <form:checkbox path="spamFilter"></form:checkbox>
                </td>
            </tr>
            <tr>
                <td><form:label path="signature">Signature </form:label></td>
                <td><form:textarea path="signature" rows="5"/></td>
            </tr>
            <tr>
                <td><input class="btn btn-primary" type="submit" value="Update">
                    <button class="btn btn-danger" type="button"><a href="/home">Cancel</a></button>
<%--                    <button class="btn btn-danger" type="submit" value="Update"></button>--%>
<%--                    <button class="btn btn-primary" type="button"><a href="/display">Cancel</a></button>--%>
                </td>
            </tr>
        </table>

</form:form>
</fieldset>
</body>
</html>
