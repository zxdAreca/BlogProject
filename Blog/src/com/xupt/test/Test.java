package com.xupt.test;

import com.xupt.dao.UserDao;
import com.xupt.dao.impl.UserDaoImpl;
import com.xupt.domain.User;

public class Test {
	
	private UserDao user = new UserDaoImpl();
	
	@org.junit.Test
	public void test1() {
		User u = new User();
		u.setEmail("11");
		u.setNick("nichen");
		u.setPassword("333");
		u.setUsername("zhangsan");
		user.register(u);
	}
	
	@org.junit.Test
	public void test2(){
		User u = user.login("zhangsan", "556");
		if(u != null) {
			System.out.println(u.getNick());
			System.out.println(u.getEmail());
			System.out.println(u.getUsername());
			System.out.println(u.getPassword());
			System.out.println(u.getId());
		}else {
			System.out.println("没有登录成功");
		}
	}
}
