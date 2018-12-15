package com.xupt.dao;

import com.xupt.domain.User;

public interface UserDao {
	/**
	 * 注册接口
	 */
	
	void register(User user);
	
	/**
	 * 登录
	 */
	User login(String username,String password);
}
