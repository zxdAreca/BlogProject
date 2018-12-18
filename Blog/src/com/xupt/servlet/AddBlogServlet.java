package com.xupt.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xupt.domain.Blog;
import com.xupt.domain.User;
import com.xupt.service.BlogService;
import com.xupt.service.impl.BlogServiceImpl;

/**
 * 添加博客
 * @author hd
 *
 */
public class AddBlogServlet extends HttpServlet {
	
	private BlogService blogservice = new BlogServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		Blog blog = new Blog();
		try {
			
			String blog_name = request.getParameter("blog_name");
			String blog_content = request.getParameter("blog_content");
			String blog_time = request.getParameter("blog_time");
			User user = (User)request.getSession().getAttribute("www");
			
			
			
			blog.setBlog_name(blog_name);
			blog.setBlog_content(blog_content);
			blog.setBlog_time(blog_time);
			blog.setBlog_id(user.getId());
			
			blogservice.insert(blog);
			System.out.println("添加成功");
			
			request.getRequestDispatcher("/servlet/BlogListServlet").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
