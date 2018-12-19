package com.xupt.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xupt.domain.Blog;
import com.xupt.domain.Comment;
import com.xupt.service.CommentService;
import com.xupt.service.impl.CommentServiceImpl;


public class AddCommentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private CommentService commentService = new CommentServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		Comment comment = new Comment();
		
		try {
			
			String comment_content = request.getParameter("comment_content");
			String comment_time = request.getParameter("comment_time");
			
			Blog blog = (Blog)request.getSession().getAttribute("blog2");
		 	 
			comment.setComment_content(comment_content);
			comment.setComment_time(comment_time);
			comment.setComment_id(blog.getId());
			
			commentService.insertComment(comment);
			System.out.println("添加评论成功");
			
			request.getRequestDispatcher("/servlet/CommentListServlet").forward(request, response);;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
