package com.person.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.person.dao.inte.UserDaoInte;
import com.person.model.UserModel;
import com.person.service.inte.UserServiceInte;

@Service(value="userServiceImpl")
public class UserServiceImpl implements UserServiceInte{
	
	private UserDaoInte userDaoImpl;
	
	@Autowired
	@Qualifier("userDaoImpl")
	public void setUserDaoImpl(UserDaoInte userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	public List<UserModel> showUser() {
		return userDaoImpl.showUser();
	}
}
