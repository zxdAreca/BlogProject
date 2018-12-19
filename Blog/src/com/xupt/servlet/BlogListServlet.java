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
import com.xupt.domain.User;
import com.xupt.service.BlogService;
import com.xupt.service.impl.BlogServiceImpl;


public class BlogListServlet extends HttpServlet {
	private BlogService blogservice = new BlogServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		List<Blog> list = new ArrayList<>(); 	
		
		User user = (User)request.getSession().getAttribute("www");
		
		try {
			list = blogservice.getBlogByUserId(user.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(list);
		request.setAttribute("list", list);
		request.getRequestDispatcher("/blog_list.jsp").forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
