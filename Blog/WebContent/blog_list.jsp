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
	<form action="${pageContext.request.contextPath }/servlet/SearchBlogServlet" method="post"> 
		按标题查询<input type="text" name="blog_name"/>
		&nbsp;&nbsp;&nbsp; 
		<input type="submit" value="查询">
	</form>

	<form action="${pageContext.request.contextPath }/servlet/BlogListServlet" method="post">
		<input type="hidden" name="blog_id" value="${blog.blog_id }"/>
		<br>博客列表<br>
		<table border="1" width="70%">
			<tr>
				<td colspan="6">
					&nbsp;&nbsp;&nbsp;	
					<a href="${pageContext.request.contextPath }/addblog.jsp">添加</a>
					&nbsp;&nbsp;&nbsp;	
					<a href="${pageContext.request.contextPath}/servlet/LogoutServlet">安全退出</a>
				</td>
			</tr>
			<tr align="center">
				<td>编号</td>
				<td>标题</td>
				<td>内容</td>
				<td>时间</td>
				<td>操作</td>
				<td>点击查看</td>
			</tr>
			<c:forEach items="${list}" var="blog">
				<tr align="center">
					<td>${blog.id }</td>
					<td>${blog.blog_name }</td>
					<td>${blog.blog_content }</td>
					<td>${blog.blog_time }</td> 
					<td>
						<a href="${pageContext.request.contextPath }/servlet/UpdateServletUI?id=${blog.id}">修改</a>  
						<a href="${pageContext.request.contextPath }/servlet/DeleteBlogServlet?id=${blog.id }">删除</a>
					</td>
					<td><a href="${pageContext.request.contextPath }/servlet/LookOneServlet?id=${blog.id }">查看</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>