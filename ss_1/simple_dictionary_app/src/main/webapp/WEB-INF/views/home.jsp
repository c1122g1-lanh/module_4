<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/03/2023
  Time: 1:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link href="../bootstrap-5.1.3-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <script src="../bootstrap-5.1.3-dist/js/bootstrap.min.js"></script>
</head>
<body>
<form action="/translate" method="post">
    <input type="text" name="word">
    <button type="submit" class="btn btn-success">Submit</button>
</form>
</body>
</html>
