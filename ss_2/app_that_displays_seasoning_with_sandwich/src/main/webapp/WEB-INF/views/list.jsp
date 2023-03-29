<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/03/2023
  Time: 10:34 SA
  To change this template use File | Settings | File Templates.
--%>
<link href="../bootstrap-5.1.3-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script src="../bootstrap-5.1.3-dist/js/bootstrap.min.js"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu Sprice</title>
</head>
<body>
<c:forEach items="${condiment}" var="condiment">
    <ul class="list-group" style="display: inline-block">
        <li class="list-group-item">${condiment}</li>
    </ul>
</c:forEach>

</body>
</html>
