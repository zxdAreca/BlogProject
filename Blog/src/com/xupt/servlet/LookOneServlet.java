package com.xupt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xupt.domain.Blog;
import com.xupt.service.BlogService;
import com.xupt.service.impl.BlogServiceImpl;

/**
 * 查看单条数据
 * @author hd
 *
 */
public class LookOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private BlogService blogService = new BlogServiceImpl(); 
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Blog blog = blogService.getBlogById(id);
		System.out.println(blog);
		request.setAttribute("blog", blog);
		request.getRequestDispatcher("/lookone.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
 