<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>详细信息</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath }/servlet/CommentListServlet?id=${blog.id}">
	<table border="1" width="400">
		<tr align="center">
			<td>id</td>
			<td>${blog.id }</td>
		</tr>
		<tr>
			<td>name</td>
			<td>${blog.blog_name }</td>
		</tr>
		<tr>
			<td>content</td>
			<td>${blog.blog_content }</td>
		</tr>
		<tr>
			<td>time</td>
			<td>${blog.blog_time }</td>
		</tr>
		<tr>
			<td>blog_id</td>
			<td>${blog.blog_id }</td>
		</tr>
		<tr>
			<td cosplan="2">
				<input type="submit" value="查看评论"/>
			</td>
		</tr>
		
	</table>	
	</form>
</body>
</html>