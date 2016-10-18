package com.niit.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.Userdetails;

@Repository
public class Userdaoimpl implements Userdao{

	@Autowired
	private SessionFactory sessionfactory;
	
	@Transactional
	public void save(Userdetails user) {
	sessionfactory.getCurrentSession().saveOrUpdate(user);	
		}

	@Transactional
	public void delete(Userdetails user) {
	sessionfactory.getCurrentSession().delete(user);
	}	
	@Transactional
	public Userdetails getusername(String username) {
		
		@SuppressWarnings("deprecation")
		Criteria c=sessionfactory.getCurrentSession().createCriteria(Userdetails.class);
		c.add(Restrictions.eq("username", username));
		Userdetails user=(Userdetails) c.uniqueResult();
		return user;
	}

	@Transactional
	public Userdetails viewuser(int userid) {
		@SuppressWarnings("deprecation")
		Criteria c=sessionfactory.getCurrentSession().createCriteria(Userdetails.class);
		c.add(Restrictions.eq("userid", userid));
		Userdetails user=(Userdetails) c.uniqueResult();
		return user;
	}

	
	

}
