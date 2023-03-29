<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/03/2023
  Time: 11:29 SA
  To change this template use File | Settings | File Templates.
--%>
<link href="../bootstrap-5.1.3-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script src="../bootstrap-5.1.3-dist/js/bootstrap.min.js"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu choose</title>
</head>
<body>
<form action="/list" method="post">
    <div class="form-check">
        <input class="form-check-input" type="checkbox" name="condiment" value="Lettuce" id="flexCheckDefault">
        <label class="form-check-label" for="flexCheckDefault">
            Lettuce
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" name="condiment" value="Tomato" id="flexCheckDefault1">
        <label class="form-check-label" for="flexCheckDefault1">
            Tomato
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" name="condiment" value="Mustard" id="flexCheckDefault2">
        <label class="form-check-label" for="flexCheckDefault2">
            Mustard
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" name="condiment" value="Sprouts" id="flexCheckDefault3">
        <label class="form-check-label" for="flexCheckDefault3">
            Sprouts
        </label>
    </div>
    <button type="submit" class="btn btn-outline-success">Submit</button>
</form>
</body>
</html>
