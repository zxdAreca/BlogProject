<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询页</title>
</head>
<body>
	<form method="post" action="/serlvet/SearchBlogServlet">
		<table border="1" width="80%">
		<tr>
			<td colspan="6">
				按标题查询<input type="text" name="blog_name"/>
				&nbsp;&nbsp;&nbsp;
				<input type="submit" value="查询">
				&nbsp;&nbsp;&nbsp;	
				<a href="${pageContext.request.contextPath }/addblog.jsp">添加</a>
				&nbsp;&nbsp;&nbsp;	
				<a href="${pageContext.request.contextPath}/servlet/BlogListServlet">返回主界面</a>
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
					<a href="${pageContext.request.contextPath }/servlet/DeleteBlogServlet?id=${blog.id}">删除</a>
				</td>
				<td><a href="${pageContext.request.contextPath }/servlet/LookOneServlet?id=${blog.id}">查看</a></td>
			</tr>
		</c:forEach>
	</table>
	</form>
</body>
</html>