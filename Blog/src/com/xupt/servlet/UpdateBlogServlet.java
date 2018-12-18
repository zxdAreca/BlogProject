package com.xupt.servlet;

import java.io.IOException;
import java.text.ParseException;
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
 * 修改数据
 * @author hd
 *
 */
public class UpdateBlogServlet extends HttpServlet {
	
	private BlogService blogservice = new BlogServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Blog blog = new Blog();
		User user = (User)request.getSession().getAttribute("www");
		try {
			
			String blog_name = request.getParameter("blog_name");
			String blog_content = request.getParameter("blog_content");
			String blog_time = request.getParameter("blog_time");
			int id = Integer.parseInt(request.getParameter("id"));	
			int blog_id = user.getId();
			
			blog.setId(id);
			blog.setBlog_name(blog_name);
			blog.setBlog_content(blog_content);
			blog.setBlog_time(blog_time);
			blog.setBlog_id(blog_id);
			
			blogservice.update(blog);
			System.out.println("修改成功");
			
			request.getRequestDispatcher("/servlet/BlogListServlet").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
