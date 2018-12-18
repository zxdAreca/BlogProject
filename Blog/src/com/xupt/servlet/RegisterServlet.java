package com.xupt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xupt.domain.User;
import com.xupt.service.UserService;
import com.xupt.service.impl.UserServiceImpl;

/**
 * register
 * @author hd
 *
 */
public class RegisterServlet extends HttpServlet {
	
	private UserService userService = new UserServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = new User(); 
		
		String nick = request.getParameter("nick");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		user.setNick(nick);
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		
		userService.register(user);
		
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
