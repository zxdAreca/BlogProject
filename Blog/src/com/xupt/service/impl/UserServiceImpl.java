package com.xupt.service.impl;

import com.xupt.dao.UserDao;
import com.xupt.dao.impl.UserDaoImpl;
import com.xupt.domain.User;
import com.xupt.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao dao = new UserDaoImpl(); 
	
	@Override
	public void register(User user) {
		dao.register(user);		
	}

	@Override
	public User login(String username, String password) {
		User u = dao.login(username, password);
		return u;
		//return dao.login(username, password);
	}

}
 