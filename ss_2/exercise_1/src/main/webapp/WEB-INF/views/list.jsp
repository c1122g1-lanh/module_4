<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/03/2023
  Time: 10:34 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu Sprice</title>
</head>
<body>
<c:forEach items="${condiment}" var="condiment">
    <span>${condiment}</span>
</c:forEach>
</body>
</html>
