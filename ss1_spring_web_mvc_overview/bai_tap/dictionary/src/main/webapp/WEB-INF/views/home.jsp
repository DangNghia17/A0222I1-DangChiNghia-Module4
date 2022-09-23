<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 23/09/2022
  Time: 6:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home Page Dictionary</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>
</head>
<body>
<h1>Dictionary Online </h1>

<div class="row">
    <div class="col-md-6">
        <form action="/dictionary" method="post">
            <h3 style="font-style: italic ; text-indent: 10px"><label>English :</label></h3>
            <input class="form-control" type="text" name="english" placeholder="Input your word want to convert"
                   value="">
            <br>
            <input class="btn btn-primary btn-block" type="submit" value="Click to convert">
        </form>
    </div>
    <div class="col-md-6 border-left">
    <br><br>
        <h3>Word your input : ${english}</h3>
        <h3>Result after translated : ${result}</h3>
    </div>
</div>
</body>
</html>
