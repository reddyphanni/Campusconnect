package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.Forumcomments;

@SuppressWarnings("unchecked")
@Repository
public class Forumcommentdaoimpl implements Forumcommentdao {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	@Transactional
	public void saveOrUpdate(Forumcomments fcomment) {
		sessionFactory.getCurrentSession().saveOrUpdate(fcomment);
	}

	@Transactional
	public List<Forumcomments> getComments(int fid) {
		@SuppressWarnings("deprecation")
		Criteria c=sessionFactory.getCurrentSession().createCriteria(Forumcomments.class);
		c.add(Restrictions.eq("c_fid", fid));
		List<Forumcomments> list=c.list();
		return list;
	}

}
