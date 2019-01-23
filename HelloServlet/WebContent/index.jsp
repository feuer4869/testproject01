<%@ page language="java"
	contentType="text/html; UTF-8"
	pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
  <head>
  <meta charset=utf-8>
<title>HelloServlet</title>
</head>
<body>

<input type="button" value="Hello Servlet" onclick="location.href='HelloServlet'">
<input type="button" value="WelcomeServlet" onclick="location.href='welcome.jsp'">
<input type="button" value="問い合わせ" onclick="location.href='inquiry.jsp'">
<br>
GET通信
<form method="get" action="TestServlet">
	<input type="text" name="username">
	<input type="password" name="password">
	<input type="submit" value="送信">
</form>
POST通信
<form method="post" action="TestServlet">
	<input type="text" name="username">
	<input type="password" name="password">
	<input type="submit" value="送信">
</form>

<input type="button" value="MySQLServlet" onclick="location.href='MySQLServlet'">

</body>
</html>