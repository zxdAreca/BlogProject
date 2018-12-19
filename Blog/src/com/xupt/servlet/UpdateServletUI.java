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
 * 获取到原来信息再修改
 * 修改信息
 * @author hd
 *
 */
public class UpdateServletUI extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private BlogService blogService = new BlogServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		int id = Integer.parseInt(request.getParameter("id"));
		Blog blog = blogService.getBlogById(id);
		request.setAttribute("blog", blog);
		request.getRequestDispatcher("/updateUI.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
 