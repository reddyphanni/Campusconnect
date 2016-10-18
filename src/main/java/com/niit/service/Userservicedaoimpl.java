package com.niit.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.niit.dao.Userdao;
import com.niit.models.Userdetails;
@Service
public class Userservicedaoimpl implements Userservicedao {

	@Autowired
	Userdao userdao;
	@Autowired
	Userdetails user;
	
	public void save(Userdetails user) {
		user.setRole_name("ROLE_USER");
		user.setEnabled("1");
	 
		userdao.save(user);
		
	}


	public void delete(Userdetails user) {
		userdao.delete(user);
		
	}

	public void getusername(HttpSession session) 
	{
		String username = SecurityContextHolder.getContext().getAuthentication().getName(); 
		Userdetails user=userdao.getusername(username);
	
		session.setAttribute("userid",user.getUserid());
		session.setAttribute("name", user.getName());
	}


	@Override
	public Userdetails viewuser(HttpSession session) {
		return userdao.viewuser( (int) session.getAttribute("userid")); 
		
	}
		
     
	}


