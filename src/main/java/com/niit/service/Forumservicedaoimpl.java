package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.niit.dao.Forumdao;
import com.niit.models.Forum;

@Service
public class Forumservicedaoimpl implements Forumservicedao {
	@Autowired
	private Forumdao forumdao;

	public void create(Forum forum,HttpSession session) {
		forum.setF_userid((int)session.getAttribute("userid"));
		forum.setDate1(new java.util.Date());
	forumdao.save(forum);
		
	}

	public void delete(int id) {
		Forum forum = forumdao.getforum(id);
		forumdao.delete(forum);
		
	}

	public String allforums() {
		List<Forum> list=forumdao.allforums();
		Gson gson=new Gson();
	    String s=gson.toJson(list);
	    return s;
	
	}

	
	public Forum editforum(int id) {
		return forumdao.getforum(id);
		
	}

	public List<Forum> getsingleform(int fid) {
	return	forumdao.getsingleform(fid);
	
	}

	



	
		
	}


