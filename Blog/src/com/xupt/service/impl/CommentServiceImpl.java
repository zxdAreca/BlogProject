package com.xupt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.xupt.dao.CommentDao;
import com.xupt.domain.Comment;
import com.xupt.dao.impl.CommentDaoImpl;

import com.xupt.service.CommentService;


public class CommentServiceImpl implements CommentService {
	
	private CommentDao commentDao = new CommentDaoImpl();
	
	@Override
	public List<Comment> getCommentById(int id) throws SQLException {
		return commentDao.getCommentById(id);
	}
	
	@Override
	public void deleteComment(int id) throws SQLException {
		commentDao.deleteComment(id);
	}

	@Override
	public void insertComment(Comment comment) throws SQLException {
		commentDao.insertComment(comment);
	
	}

}
