package com.xupt.domain;

import java.util.Date;

public class Blog {
	private static final long serialVersionUID = 1L;
	private int id;
	private String blog_name;
	private String blog_content;
	private String blog_time;
	private int blog_id;
	
/*	public Blog(String blog_name, String blog_content) {
		super();
		this.blog_name = blog_name;
		this.blog_content = blog_content;
	}*/
	@Override
	public String toString() {
		return "Blog [id=" + id + ", blog_name=" + blog_name + ", blog_content=" + blog_content + ", blog_time="
				+ blog_time + ", blog_id=" + blog_id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBlog_name() {
		return blog_name;
	}
	public void setBlog_name(String blog_name) {
		this.blog_name = blog_name;
	}
	public String getBlog_content() {
		return blog_content;
	}
	public void setBlog_content(String blog_content) {
		this.blog_content = blog_content;
	}
	public String getBlog_time() {
		return blog_time;
	}
	public void setBlog_time(String blog_time) {
		this.blog_time = blog_time;
	}
	public int getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
