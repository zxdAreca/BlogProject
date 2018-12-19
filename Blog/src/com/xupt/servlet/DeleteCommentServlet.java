package com.xupt.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xupt.service.CommentService;
import com.xupt.service.impl.CommentServiceImpl;

/**
 * Servlet implementation class DeleteCommentServlet
 */
public class DeleteCommentServlet extends HttpServlet {
	
	private CommentService comment = new CommentServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		try {
			comment.deleteComment(id);
			
			System.out.println("删除评论成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/servlet/CommentListServlet").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
