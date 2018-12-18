package com.xupt.dao;

import java.sql.SQLException;
import java.util.List;

import com.xupt.domain.Blog;

public interface BlogDao {
	
	/**
	 * 查询所有博客
	 */
	List<Blog> findAll() throws SQLException;
	
	/**
	 * 模糊查询，根据博客名称和内容
	 * @param blog_name
	 * @param blog_content
	 * @return
	 */
	List<Blog> searchBlog(String blog_name);
	
	
	/**
	 * 添加博客
	 * @param blog
	 * @throws SQLException
	 */
	void insert(Blog blog) throws SQLException;
	
	/**
	 * 根据id删除博客
	 * @param id
	 * @throws SQLException
	 */
	void delete(int id) throws SQLException;
	
	/**
	 * 更新学生信息
	 * @param blog
	 * @throws SQLException
	 */
	void update(Blog blog) throws SQLException;
	
	/**
	 * 
	 * @param id
	 * @return
	 */ 
	List<Blog> getBlogByUserId(int id) throws SQLException;
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Blog getBlogById(int id);
}
