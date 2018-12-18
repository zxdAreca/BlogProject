package com.xupt.domain;

import java.util.Date;

public class Comment {
	private int id;
	private String comment_content;
	private int comment_id;
	private String comment_time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}
	public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
	public String getComment_time() {
		return comment_time;
	}
	public void setComment_time(String comment_time) {
		this.comment_time = comment_time;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", comment_content=" + comment_content + ", comment_id=" + comment_id
				+ ", comment_time=" + comment_time + "]";
	}
}
