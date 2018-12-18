package com.xupt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.xupt.dao.CommentDao;
import com.xupt.domain.Comment;
import com.xupt.dao.impl.CommentDaoImpl;

import com.xupt.service.CommentService;


public class CommentServiceImpl implements CommentService {
	private CommentDao comment = new CommentDaoImpl();
	@Override
	public List<Comment> getCommentById(int id) throws SQLException {
		return comment.getCommentById(id);
	}

}
