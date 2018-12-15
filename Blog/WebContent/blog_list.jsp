<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>博客</title>
</head>
<body>
	<br>博客列表<br>
	<table border="1" width="700">
		<tr align="center">
			<td>编号</td>
			<td>标题</td>
			<td>内容</td>
			<td>时间</td>
			<td>链接id</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="blog">
		<tr align="center">
			<td>${ blog.id }</td>
			<td>${ blog.blog_name }</td>
			<td>${ blog.blog_content }</td>
			<td>${ blog.blog_time }</td>
			<td>${ blog.blog_id }</td>
			<td><a href="#">添加</a> <a href="#">删除</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>