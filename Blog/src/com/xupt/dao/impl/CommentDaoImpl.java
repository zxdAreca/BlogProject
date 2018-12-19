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
	
	/**
	 * 查询对应博客的评论
	 */
	@Override
	public List<Comment> getCommentById(int id) throws SQLException {
		return qr.query("select comment.* from comment inner join blog on blog.id = comment.comment_id where blog.id = ?", 
				new BeanListHandler<Comment>(Comment.class),id);
	}
	
	/**
	 * 删除评论
	 */
	@Override
	public void deleteComment(int id) throws SQLException {
		qr.update("delete from comment where id = ?", id);
	}
	
	/**
	 * 添加评论
	 */
	@Override
	public void insertComment(Comment comment) throws SQLException {
		qr.update("insert into comment(comment_content,comment_time,comment_id) values(?,?,?)", 
				comment.getComment_content(),
				comment.getComment_time(),
				comment.getComment_id()
				);
	}
	
	

}
