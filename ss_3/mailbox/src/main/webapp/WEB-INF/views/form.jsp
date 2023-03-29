<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/03/2023
  Time: 9:51 SA
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form binding</title>
</head>
<body>
<h1>Settings</h1>
<form:form action="/form" method="post" modelAttribute="mailbox">
    <label>Languages</label>
    <form:select path="languages">
        <form:options items="${language}"></form:options>
    </form:select>
    <br><br>
    <label>Page size</label>
    <span>Show</span>
    <form:select path="pageSize">
        <form:options items="${pagesize}"></form:options>
    </form:select>
    <span>emails per page</span>
    <br><br>
    <label>Spam filter</label>
    <form:checkbox path="spamFilter" value="1"></form:checkbox>
    <label>Enable spam filter</label>
    <br><br>
    <label>Signature</label>
    <form:textarea path="signature"></form:textarea>
    <br><br>
    <button type="submit">update</button>
    <%--    <button onclick="location.href='/form1'">cancel</button>--%>
    <input type="reset" value="cancel">
</form:form>
</body>
</html>
