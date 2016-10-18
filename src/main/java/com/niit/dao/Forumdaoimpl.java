package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.Forum;
@Repository
public class Forumdaoimpl implements Forumdao {
	@Autowired
	private SessionFactory sessionfactory;
	
@Transactional
	public void save(Forum forum) {
		sessionfactory.getCurrentSession().saveOrUpdate(forum);
		
		
	}
@Transactional
public void delete(Forum forum) {
	sessionfactory.getCurrentSession().delete(forum);
	
	
}
@SuppressWarnings("unchecked")
@Transactional
public List<Forum> allforums() {
	@SuppressWarnings("deprecation")
	Criteria c = sessionfactory.getCurrentSession().createCriteria(Forum.class);
	
	List<Forum> list = c.list();
	
	return list;
}
@Transactional
public Forum getforum(int fid) {
	@SuppressWarnings("deprecation")
	Criteria c= sessionfactory.getCurrentSession().createCriteria(Forum.class);
	c.add(Restrictions.eq("f_id",fid));
	Forum forum = (Forum) c.uniqueResult();
	return forum;
}
@Transactional
public List<Forum> getsingleform(int fid) {
Criteria c = sessionfactory.getCurrentSession().createCriteria(Forum.class);
	
	
	c.add(Restrictions.eq("f_id", fid));
	List<Forum> list = c.list();
	return list;
	
}






}
