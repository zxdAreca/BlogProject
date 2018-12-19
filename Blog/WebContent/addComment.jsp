<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/servlet/AddCommentServlet">
		<table border="1" width="500">
			<tr>
				<td>内容</td>
				<td><input type="text" name="comment_content"/></td>
			</tr>
			<tr>
				<td>时间</td>
				<td><input type="date" name="comment_time"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="添加"/></td>
			</tr>
		</table>
	</form>
</body>
</html>