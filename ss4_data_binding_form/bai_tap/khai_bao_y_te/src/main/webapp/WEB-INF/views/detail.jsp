<%--
  Created by IntelliJ IDEA.
  User: Nghia Fuckboy
  Date: 08/07/2022
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>
</head>
<body>
<h1 style="color: red ; text-align: center">Thông tin khai báo của bạn !!</h1>
<table border="1px" class="table table-striped table-dark">
    <tr>
        <td>Họ tên</td>
        <td>${healthDeclare.name}</td>
        <td></td>
    </tr>
    <tr>
        <td>Năm sinh</td>
        <td>${healthDeclare.birthday}</td>
        <td></td>
    </tr>
    <tr>
        <td>Giới tính</td>
        <td>${healthDeclare.gender}</td>
        <td></td>
    </tr>
    <tr>
        <td>Quốc tịch</td>
        <td>${healthDeclare.nationality}</td>
        <td></td>
    </tr>
    <tr>
        <td>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</td>
        <td>${healthDeclare.idCard}</td>
        <td></td>
    </tr>
    <tr>
        <td>Thông tin đi lại</td>
        <td>${healthDeclare.travelInfo}</td>
        <td></td>
    </tr>
    <tr>
        <td>Số hiệu phương tiện</td>
        <td>${healthDeclare.numberVehicle}</td>
        <td></td>
    </tr>
    <tr>
        <td>Số ghế</td>
        <td>${healthDeclare.numberSeat}</td>
        <td></td>
    </tr>
    <tr>
        <td>Thông tin đi lại</td>
        <td>${healthDeclare.otherInfo}</td>
        <td></td>
    </tr>
</table>
</body>
</html>
