package com.xupt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.xupt.dao.BlogDao;
import com.xupt.dao.impl.BlogDaoImpl;
import com.xupt.domain.Blog;
import com.xupt.service.BlogService;

public class BlogServiceImpl implements BlogService {

	private BlogDao dao = new BlogDaoImpl();
	
	@Override
	public List<Blog> findAll() throws SQLException {
		return dao.findAll();
		
	}

	@Override
	public List<Blog> searchBlog(String blog_name) {
		return dao.searchBlog(blog_name);
	}

	@Override
	public void insert(Blog blog) throws SQLException {
		dao.insert(blog);
	}

	@Override
	public void delete(int id) throws SQLException {
		dao.delete(id);
	}

	@Override
	public void update(Blog blog) throws SQLException {
		dao.update(blog);
	}

	@Override
	public List<Blog> getBlogByUserId(int id) throws SQLException {
		return dao.getBlogByUserId(id);
	}

	@Override
	public Blog getBlogById(int id) {
		return dao.getBlogById(id);
	}

}
