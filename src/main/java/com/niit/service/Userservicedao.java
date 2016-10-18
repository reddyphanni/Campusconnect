package com.niit.service;


import javax.servlet.http.HttpSession;

import com.niit.models.Userdetails;

public interface Userservicedao {
	public void save(Userdetails user);
	public void delete(Userdetails user);
	public void getusername(HttpSession session);
	public Userdetails viewuser(HttpSession session);
	

}
