package com.niit.dao;

import java.util.List;

import com.niit.models.Forumcomments;

public interface Forumcommentdao {

	
	public void saveOrUpdate(Forumcomments fcomment);
	public List<Forumcomments> getComments(int fid);
}
