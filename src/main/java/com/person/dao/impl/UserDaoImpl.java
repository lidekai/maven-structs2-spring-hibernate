package com.person.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.person.dao.inte.UserDaoInte;
import com.person.model.UserModel;

@Repository(value="userDaoImpl")
public class UserDaoImpl implements UserDaoInte{
	
    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

	@SuppressWarnings("unchecked")
	@Transactional
	public List<UserModel> showUser() {
		List<UserModel> list = this.getSession().createQuery("from UserModel").list();
		return list;
	}

}
