package com.xupt.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xupt.domain.Blog;
import com.xupt.domain.Comment;
import com.xupt.service.CommentService;
import com.xupt.service.impl.CommentServiceImpl;

public class CommentListServlet extends HttpServlet {
	
	private CommentService commentService = new CommentServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
//		int id = Integer.parseInt(request.getParameter("id"));
		
		Blog blog = (Blog)request.getSession().getAttribute("blog2");
		
		
		List<Comment> list = new ArrayList<>();
		
		try {
			
			list = commentService.getCommentById(blog.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(list.size());
		System.out.println("获取评论数据" + list);
		request.setAttribute("st", list);
		request.getRequestDispatcher("/commentList.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
