package com.niit.dao;

import java.util.List;

import com.niit.models.Forum;

public interface Forumdao {
	public void save(Forum forum);
	public void delete(Forum forum);
	public List<Forum> allforums();
	public Forum getforum(int bid);
	
	public List<Forum> getsingleform(int fid);
}
