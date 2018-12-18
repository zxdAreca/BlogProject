package com.xupt.test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.xupt.dao.BlogDao;
import com.xupt.dao.UserDao;
import com.xupt.dao.impl.BlogDaoImpl;
import com.xupt.dao.impl.UserDaoImpl;
import com.xupt.domain.Blog;
import com.xupt.domain.User;
import com.xupt.service.BlogService;

public class Test {
	
	private UserDao user = new UserDaoImpl();
	private BlogDao blog = new BlogDaoImpl();
	
	@org.junit.Test
	public void test1() {
		User u = new User();
		u.setEmail("11@qq.com");
		u.setNick("nichen");
		u.setPassword("admin");
		u.setUsername("keai");
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
	
	@org.junit.Test
	public void test3() throws SQLException {
		List<Blog> list = blog.findAll();
		System.out.println(list.size());
		System.out.println(list);
	}
	
	@org.junit.Test
	public void test4() throws SQLException {
		int id = 4;
		blog.delete(id);
	}
	
	@org.junit.Test
	public void test5() throws SQLException, ParseException{
		Blog b = new Blog();
		b.setBlog_name("wangyifefdsfs");
		b.setBlog_content("zheshiyigeDemo22222");		
		b.setBlog_time("2018-12-1");
		b.setBlog_id(5);
		blog.insert(b);
	}
	
	@org.junit.Test
	public void Test6(){
		
		List<Blog> list = blog.searchBlog("%机%");
		System.out.println(list);
	}
	
	
}
