<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>评论</title>
</head>
<body>
		<br>评论列表<br>
		<table border="1" width="60%">
			<tr>
				<td colspan="4">
					&nbsp;&nbsp;&nbsp;	
					<a href="${pageContext.request.contextPath}/addComment.jsp">添加</a>
					&nbsp;&nbsp;&nbsp;	
					<a href="${pageContext.request.contextPath}/servlet/BlogListServlet">返回博客</a>
				</td>
			</tr>
			<tr align="center">
				<td>编号</td>
				<td>内容</td>
				<td>时间</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${st }" var="comment">
				<tr align="center">
					<td>${ comment.id}</td>
					<td>${ comment.comment_content }</td>
					<td>${ comment.comment_time }</td>
					<td>
						<a href="#">修改</a> 
						<a href="${pageContext.request.contextPath }/servlet/DeleteCommentServlet?id=${comment.id}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>