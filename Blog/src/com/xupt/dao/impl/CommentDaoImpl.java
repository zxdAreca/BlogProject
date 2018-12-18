package com.xupt.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.xupt.dao.CommentDao;
import com.xupt.domain.Comment;
import com.xupt.util.DBCPUtil;

public class CommentDaoImpl implements CommentDao {
	
	private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
	@Override
	public List<Comment> getCommentById(int id) throws SQLException {
		return qr.query("select comment.* from blog inner join comment on blog.blog_id=comment.comment_id where comment.id = ?", 
				new BeanListHandler<Comment>(Comment.class),id);
	}

}
