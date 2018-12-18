package com.xupt.dao;

import java.sql.SQLException;
import java.util.List;

import com.xupt.domain.Comment;

public interface CommentDao  {
	List<Comment> getCommentById(int id)throws SQLException;
}
