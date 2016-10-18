package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.niit.models.Blog;

public interface Blogservicedao {
	public void create(Blog blog,HttpSession session); 
	public void delete(int id);
	public String allblogs();
	public Blog editblog(int id);
	public List<Blog> getallblogs(int bid);
	
	
	

}
