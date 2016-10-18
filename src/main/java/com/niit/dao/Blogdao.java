package com.niit.dao;

import java.util.List;

import com.niit.models.Blog;

public interface Blogdao {
	public void save(Blog blog);
	public void delete(Blog blog);
	public List<Blog> allblogs();
	public Blog getblog(int bid);
	public List<Blog> getallblogs(int bid);
	

}
