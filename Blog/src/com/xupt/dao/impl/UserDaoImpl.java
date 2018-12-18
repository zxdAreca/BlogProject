package com.xupt.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.xupt.dao.UserDao;
import com.xupt.domain.User;
import com.xupt.util.DBCPUtil;


/**
 * private int id;
	private String nick;
	private String username;
	private String password;
	private String email;
 * @author hd
 *
 */
public class UserDaoImpl implements UserDao{
	private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
	@Override
	public void register(User user) {
		try{
			qr.update("insert into user(nick,username,password,email) values(?,?,?,?)", 
					user.getNick(),user.getUsername(),user.getPassword(),user.getEmail());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		

	@Override
	public User login(String username, String password) {
		String sql = "select * from user where username=? and password=?";
		try {
			return qr.query(sql, new BeanHandler<User>(User.class),username,password);
		}catch(Exception e){
			throw new RuntimeException();
		}
	}
		
}
