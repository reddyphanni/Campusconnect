package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.Blog;
@Repository
public class Blogdaoimpl implements Blogdao {
	@Autowired
	private SessionFactory sessionfactory;
	
@Transactional
	public void save(Blog blog) {
		sessionfactory.getCurrentSession().saveOrUpdate(blog);
		
		
	}
@Transactional
public void delete(Blog blog) {
	sessionfactory.getCurrentSession().delete(blog);
	
	
}
@SuppressWarnings("unchecked")
@Transactional
public List<Blog> allblogs() {
	@SuppressWarnings("deprecation")
	Criteria c = sessionfactory.getCurrentSession().createCriteria(Blog.class);
	
	List<Blog> list = c.list();
	
	return list;
}
@Transactional
public Blog getblog(int bid) {
	@SuppressWarnings("deprecation")
	Criteria c= sessionfactory.getCurrentSession().createCriteria(Blog.class);
	c.add(Restrictions.eq("b_id",bid));
	Blog blog = (Blog) c.uniqueResult();
	return blog;
}
@Transactional
public List<Blog> getallblogs(int bid) {
	@SuppressWarnings("deprecation")
	Criteria c=sessionfactory.getCurrentSession().createCriteria(Blog.class);
	c.add(Restrictions.eq("b_id",bid));
	@SuppressWarnings("unchecked")
	List<Blog> list=c.list();
	for (Blog obj : list)
	{System.out.println(obj.getB_id());
	System.out.println(obj.getB_userid());
	System.out.println(obj.getDescription());
	}
	
	return list;
}

}
