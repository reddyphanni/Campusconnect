package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.niit.dao.Forumcommentdao;
import com.niit.models.Forumcomments;

@Service
public class Forumcommentserviceimpl implements Forumcommentservicedao {

	@Autowired
	private Forumcommentdao forumcommentdao;
	

	public void createForum(Forumcomments fcomment,HttpSession session) {
		
		
		fcomment.setC_userid((int)session.getAttribute("userid"));
		fcomment.setCommenttime(new java.util.Date());
		
		forumcommentdao.saveOrUpdate(fcomment);
	}

	public String getAllComments(int fid) 
	{
	List<Forumcomments> list= forumcommentdao.getComments(fid);
	Gson gson=new Gson();
	String com=gson.toJson(list);
	return com;
	}

}
