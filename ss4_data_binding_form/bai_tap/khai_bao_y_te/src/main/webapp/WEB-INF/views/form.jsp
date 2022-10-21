<%--
  Created by IntelliJ IDEA.
  User: Nghia Fuckboy
  Date: 08/07/2022
  Time: 02:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Form Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>
    <style>
        .red {
            color: red;
        }

        .error {
            color: red;
        }
    </style>
</head>
<body>
<center>
    <h3>TỜ KHAI Y TẾ</h3>
    <h3>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG
        DỊCH BỆNH TRUYỀN NHIỄM</h3>
    <h4 style="color: red">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lí hình sự</h4>
</center>
<form:form action="/save" method="post" modelAttribute="healthDeclare" >
    <table style="width: 100%" class="table table-borderless">
        <tr>
            <td colspan="3">Họ tên (ghi chữ IN HOA)<span class="red">(*)</span></td>
        </tr>
        <tr>
            <td colspan="3"><form:input path="name" cssStyle="width: 120%"/></td>
        </tr>
        <tr>
            <td class="error">${error.name}</td>
        </tr>
        <tr>
            <td>Năm sinh<span class="red">(*)</span></td>
            <td>Giới tính<span class="red">(*)</span></td>
            <td>Quốc tịch<span class="red">(*)</span></td>

        </tr>
        <tr>
            <td><form:input path="birthday" cssStyle="width: 100%"/></td>
            <td><form:select path="gender" items="${gender}" cssStyle="width: 100%"/></td>
            <td><form:select path="nationality" items="${nationality}" cssStyle="width: 100%"/></td>
        </tr>
        <tr>
            <td class="error">${error.birthday}</td>
        </tr>
        <tr>
            <td colspan="3">Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác<span>(*)</span></td>
        </tr>
        <tr>
            <td colspan="3"><form:input path="idCard"/></td>
        </tr>
        <tr>
            <td class="error">${error.idCard}</td>
        </tr>
        <tr>
            <td colspan="3">Thông tin đi lại<span class="red">(*)</span></td>
        </tr>
        <tr>
            <td><form:radiobuttons path="travelInfo" items="${travelInfo}"/></td>
        </tr>
        <tr>
            <td class="error">${error.travelInfo}</td>
        </tr>
        <tr>
            <td colspan="1">Số hiệu phương tiện<span class="red">(*)</span></td>
            <td colspan="2">Số ghế<span>(*)</span></td>
        </tr>
        <tr>
            <td colspan="1"><form:input path="numberVehicle"/></td>
            <td colspan="2"><form:input path="numberSeat"/></td>
        </tr>
        <tr>
            <td colspan="1" class="error">${error.numberVehicle}</td>
            <td colspan="2" class="error">${error.numberSeat}</td>
        </tr>
        <tr>
            <td colspan="1">Ngày khởi hành<span class="red">(*)</span></td>
            <td colspan="2">Ngày kết thúc<span class="red">(*)</span></td>
        </tr>
        <tr>
            <td colspan="1"><form:input path="dateStart"/></td>
            <td colspan="2"><form:input path="dateEnd"/></td>
        </tr>
        <tr>
            <td colspan="1" class="error">${error.dateStart}</td>
            <td colspan="2" class="error">${error.dateEnd}</td>
        </tr>
        <tr>
            <td colspan="3">Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh thành phố nào?<span class="red">(*)</span></td>
        </tr>
        <tr>
            <td colspan="3"><form:textarea rows="3" path="otherInfo"/></td>
        </tr>
        <tr>
            <td class="error">${error.otherInfo}</td>
        </tr>
    </table>
    <div style="text-align: center;">
        <input style="text-align: center" type="submit" value="Gửi tờ khai" class="btn btn-success"/>
    </div>
    </table>
</form:form>
</body>
</html>
