package com.niit.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Forumcomments {

	@Id
	@GeneratedValue
	private int c_id;
	private int c_userid;
	private int c_fid;
	private String comments;
	private Date commenttime;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getC_userid() {
		return c_userid;
	}
	public void setC_userid(int c_userid) {
		this.c_userid = c_userid;
	}
	public int getC_fid() {
		return c_fid;
	}
	public void setC_fid(int c_fid) {
		this.c_fid = c_fid;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getCommenttime() {
		return commenttime;
	}
	public void setCommenttime(Date commenttime) {
		this.commenttime = commenttime;
	}
	

}