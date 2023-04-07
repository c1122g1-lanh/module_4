<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/03/2023
  Time: 3:41 CH
  To change this template use File | Settings | File Templates.
--%>
<link href="../bootstrap-5.1.3-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script src="../bootstrap-5.1.3-dist/js/bootstrap.min.js"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calculator</title>
</head>
<body>
<form action="calculator" method="post">
    <input type="number" name="numberFirst">
    <select name="subtend">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <input type="number" name="numberSecond">
    <input type="submit" value="submit"><br>
</form>
</body>
</html>
