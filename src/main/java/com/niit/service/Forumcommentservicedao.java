package com.niit.service;

import javax.servlet.http.HttpSession;

import com.niit.models.Forumcomments;


public interface Forumcommentservicedao {
	

	public void createForum(Forumcomments fcomment,HttpSession session);
	

	public String getAllComments(int fid);
}
