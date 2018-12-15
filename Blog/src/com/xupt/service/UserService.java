package com.xupt.service;

import com.xupt.domain.User;

public interface UserService {
	/**
	 * 注册接口
	 */
	
	void register(User user);
	
	/**
	 * 登录
	 */
	User login(String username,String password);
}
