package com.person.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.person.dao.inte.UserDaoInte;
import com.person.model.UserModel;

@Repository(value="userDaoImpl")
public class UserDaoImpl implements UserDaoInte{
	
	//��������
	List<UserModel> userModel=new ArrayList<UserModel>();
	public UserDaoImpl() {
		userModel.add(new UserModel(1,"һ"));
		userModel.add(new UserModel(2,"��"));
		userModel.add(new UserModel(3,"��"));
		userModel.add(new UserModel(4,"��"));
		userModel.add(new UserModel(5,"��"));
		userModel.add(new UserModel(6,"��"));
		userModel.add(new UserModel(7,"��"));
		userModel.add(new UserModel(8,"��"));
	}

	public List<UserModel> showUser() {
		
		return userModel;
	}

}
