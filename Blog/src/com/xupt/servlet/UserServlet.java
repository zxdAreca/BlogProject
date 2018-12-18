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
import com.xupt.service.UserService;
import com.xupt.service.impl.BlogServiceImpl;
import com.xupt.service.impl.UserServiceImpl;

/**
 * 登录
 * @author hd
 *
 */
public class UserServlet extends HttpServlet {
	
	private UserService userService = new UserServiceImpl();
	private BlogService blogService = new BlogServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User u = userService.login(username, password);
		if(u==null) {
			System.out.println("登录失败");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else {
			request.getSession().setAttribute("www", u);	
			List<Blog> list = new ArrayList<>();
			try {
				int id = u.getId();
				System.out.println("id="+id+"正在登录");
			list =  blogService.getBlogByUserId(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			request.setAttribute("list", list);
			request.getRequestDispatcher("/blog_list.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
