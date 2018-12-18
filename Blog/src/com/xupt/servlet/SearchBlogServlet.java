package com.xupt.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xupt.domain.Blog;
import com.xupt.service.BlogService;
import com.xupt.service.impl.BlogServiceImpl;
/**
 * 模糊查询
 * @author hd
 *
 */
public class SearchBlogServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private BlogService service = new BlogServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println("进入查询 ");
		
		try {
			String blog_name = request.getParameter("blog_name");
			
			blog_name = "%" + blog_name + "%";
			
			List<Blog> list = service.searchBlog(blog_name);
			request.setAttribute("list", list);
			System.out.println("查询到"+list.size()+"条数据");
			
			request.getRequestDispatcher("/blog_list.jsp").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
