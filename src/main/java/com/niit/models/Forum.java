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
public class Forum {
	@Id
	@GeneratedValue
	private int f_id;
	private int f_userid;
	
	
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public int getF_userid() {
		return f_userid;
	}
	public void setF_userid(int f_userid) {
		this.f_userid = f_userid;
	}
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	private String name;
	private Date date1;
	
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
