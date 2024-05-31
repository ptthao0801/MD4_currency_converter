<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/1/2024
  Time: 12:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="/convert" method="post">
    <label for="rate">Exchange Rate (USD to VND):</label>
    <input type="text" id="rate" name="rate"><br><br>
    <label for="usd">Amount in USD:</label>
    <input type="text" id="usd" name="usd"><br><br>
    <input type="submit" value="Convert">
</form>
</body>
</html>
