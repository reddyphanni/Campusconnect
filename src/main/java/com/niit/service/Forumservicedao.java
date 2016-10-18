package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.niit.models.Forum;

public interface Forumservicedao {
	public void create(Forum forum,HttpSession session); 
	public void delete(int id);
	public String allforums();
	public Forum editforum(int id);
	public List<Forum> getsingleform(int fid);
	
	
	

}
