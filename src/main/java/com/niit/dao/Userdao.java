package com.niit.dao;

import com.niit.models.Userdetails;

public interface Userdao {
	public void save(Userdetails user);
	public void delete(Userdetails user);
	public Userdetails getusername(String username );
	public Userdetails viewuser(int userid);

}
