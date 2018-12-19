package com.xupt.service;

import java.sql.SQLException;
import java.util.List;

import com.xupt.domain.Comment;

public interface CommentService {
	
	List<Comment> getCommentById(int id)throws SQLException;
	
	public void deleteComment(int id) throws SQLException;
	
	public void insertComment(Comment comment) throws SQLException;
}
