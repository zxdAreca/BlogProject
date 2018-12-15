<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页</title>
</head>
<body>	
	<form action="${pageContext.request.contextPath }/servlet/UserServlet" method="post">
		账号：<input type="text" name="username" /><br>
		密码：<input type="password" name="password"/><br>
		<input type="submit" value="登录"/>
	</form>
	
	<a href="${pageContext.request.contextPath }/register.jsp">注册账号</a>
</body>
</html>