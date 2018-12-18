<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加博客</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/servlet/AddBlogServlet" >
		<%-- <input type="hidden" name="blog_id" value="${blog.blog_id }" /> --%>
		<table bord="1" width="600">
			<tr>
				<td>标题</td>
				<td><input type="text" name="blog_name"/></td>
			</tr>
			<tr>
				<td>内容</td>
				<td><input type="text" name="blog_content"/></td>
			</tr>
			<tr>
				<td>时间</td>
				<td><input type="date" name="blog_time"/></td>
			</tr>
			<tr>
				<td cosplan="2"><input type="submit" value="添加"/></td>
			</tr>
		</table>
	</form>
</body>
</html>