package com.niit.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Blog {
	@Id
	@GeneratedValue
	private int b_id;
	private int b_userid;
	private Date blogdate;
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public Date getBlogdate() {
		return blogdate;
	}
	public void setBlogdate(Date blogdate) {
		this.blogdate = blogdate;
	}
	
	public int getB_userid() {
		return b_userid;
	}
	public void setB_userid(int b_userid) {
		this.b_userid = b_userid;
	}
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
