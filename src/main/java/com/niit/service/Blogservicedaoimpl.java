package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.niit.dao.Blogdao;
import com.niit.models.Blog;

@Service
public class Blogservicedaoimpl implements Blogservicedao {
	@Autowired
	Blogdao blogdao;

	public void create(Blog blog,HttpSession session) {
		blog.setB_userid((int)session.getAttribute("userid"));
		blog.setBlogdate(new java.util.Date());
		blogdao.save(blog);
		
	}

	public void delete(int id) {
		Blog blog = blogdao.getblog(id);
		blogdao.delete(blog);
		
	}

	public String allblogs() {
		List<Blog> list=blogdao.allblogs();
		Gson gson=new Gson();
	    String s=gson.toJson(list);
	    return s;
	
	}

	
	public Blog editblog(int id) {
		return blogdao.getblog(id);
		
	}

	@Transactional
	public List<Blog> getallblogs(int bid) {
		System.out.println("kjhug");
		return blogdao.getallblogs(bid);
	
		
	}



	
		
	}


