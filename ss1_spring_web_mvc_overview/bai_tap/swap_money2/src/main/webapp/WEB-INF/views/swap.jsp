<%--
  Created by IntelliJ IDEA.
  User: Nghia Fuckboy
  Date: 22/06/2022
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Swap Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>
</head>
<body>
<h1>Swap Money Online </h1>
<div class="row">
    <div class="col-md-6">
        <form action="/outmoney" method="post">
            <label>USD :</label>
            <input class="form-control" type="text" name="USD" placeholder="Input your USD you want to change" value="">

            <label>Current Rate :</label>
            <input class="form-control" type="text" name="currencyRate" value="22000" readonly>
            <br>
            <input class="btn btn-primary btn-block" type="submit" value="Click to convert">
        </form>
    </div>
    <div class="col-md-6 border-left">
        <br>
        <br>
        <h3> USD your input = ${USD} USD </h3>
        <h3> Current Rate = ${currencyRate}</h3>
        <h3> Result = ${result} VND </h3>
    </div>
</div>
</body>
</html>
