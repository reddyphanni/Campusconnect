package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.models.Forumcomments;
import com.niit.service.Forumcommentservicedao;

@RestController
public class fcommentcontrller {
	
	@Autowired
	private Forumcommentservicedao fservice;
	
	
	@PostMapping("/ForumComments")
	public void ForumComments(@RequestBody Forumcomments comment,HttpSession session) 
	{
		fservice.createForum(comment, session);
	}
	
	@GetMapping("/getAllComments/{c_fid}")
	public String getAllComments(@PathVariable("c_fid") int fid)
	{          
		return fservice.getAllComments(fid);
	}
}
