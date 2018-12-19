package com.xupt.dao;

import java.sql.SQLException;
import java.util.List;

import com.xupt.domain.Comment;

public interface CommentDao  {
	
	/**
	 * 查询评论
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	List<Comment> getCommentById(int id)throws SQLException;
	
	/**
	 * 删除评论
	 * @param id
	 * @throws SQLException
	 */
	public void deleteComment(int id) throws SQLException;
	
	/**
	 * 插入评论
	 * @param comment
	 */
	public void insertComment(Comment comment) throws SQLException;
}
