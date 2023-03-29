<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/03/2023
  Time: 2:47 CH
  To change this template use File | Settings | File Templates.
--%>
<link href="../bootstrap-5.1.3-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script src="../bootstrap-5.1.3-dist/js/bootstrap.min.js"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <style>
        th {
            text-align: left;
        }

        td {
            width: 30px;
        }

        table, th, td {
            border: black 1px solid;
        }
    </style>
</head>
<body>
<h1 style="text-align: center">Calculator</h1>
<form>
    <table class="container" style="width: 300px">
        <tr>
            <th>number first</th>
            <td>
                <button type="button" class="btn btn-primary">${numberFirst}</button>
            </td>
        </tr>
        <tr>
            <th>subtend</th>
            <td>
                <button type="button" class="btn btn-danger">${subtend}</button>
            </td>
        </tr>
        <tr>
            <th>number second</th>
            <td>
                <button type="button" class="btn btn-primary">${numberSecond}</button>
            </td>
        </tr>
        <tr>
            <th>result</th>
            <td>
                <button type="button" class="btn btn-success">${result}</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
