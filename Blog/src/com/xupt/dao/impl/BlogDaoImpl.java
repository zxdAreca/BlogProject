package com.xupt.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.xupt.dao.BlogDao;
import com.xupt.domain.Blog;
import com.xupt.util.DBCPUtil;
import com.xupt.util.TextUtils;

public class BlogDaoImpl implements BlogDao{
	
	private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
	@Override
	public List<Blog> findAll() throws SQLException {
		return qr.query("select * from blog", new BeanListHandler<Blog>(Blog.class));
	}

	@Override
	public void insert(Blog blog) throws SQLException {
		qr.update("insert into blog(blog_name,blog_content,blog_time,blog_id) values(?,?,?,?)",
				blog.getBlog_name(),
				blog.getBlog_content(),
				blog.getBlog_time(),
				blog.getBlog_id()
				);
	}

	@Override
	public void delete(int id) throws SQLException {
		qr.update("delete from blog where id=?", id);
	}

	@Override
	public void update(Blog blog) throws SQLException {
		qr.update("update blog set blog_name=? , blog_content=? , blog_time=? , blog_id=? where id = ?" , 
				blog.getBlog_name(),
				blog.getBlog_content(),
				blog.getBlog_time(),
				blog.getBlog_id(),
				blog.getId());
	}
	
	@Override
	public List<Blog> searchBlog(String blog_name) {
		try {
			return qr.query("select * from blog where blog_name like ?", new BeanListHandler<Blog>(Blog.class), blog_name);
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public List<Blog> getBlogByUserId(int id) throws SQLException {
		return qr.query("select blog.* from user inner join blog on user.id=blog.blog_id where user.id = ?",new BeanListHandler<Blog>(Blog.class),id);			
	}

	@Override
	public Blog getBlogById(int id){
		try {
			return qr.query("select * from blog where id=?", new BeanHandler<Blog>(Blog.class),id);
		}catch(Exception e) {
			throw new RuntimeException();
		}
	}
}
 