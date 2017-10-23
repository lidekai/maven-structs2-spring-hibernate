package com.person.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.person.dao.inte.UserDaoInte;
import com.person.model.UserModel;

@Repository(value="userDaoImpl")
public class UserDaoImpl implements UserDaoInte{
	
	//虚拟数据
	List<UserModel> userModel=new ArrayList<UserModel>();
	public UserDaoImpl() {
		userModel.add(new UserModel(1,"一"));
		userModel.add(new UserModel(2,"二"));
		userModel.add(new UserModel(3,"三"));
		userModel.add(new UserModel(4,"四"));
		userModel.add(new UserModel(5,"五"));
		userModel.add(new UserModel(6,"六"));
		userModel.add(new UserModel(7,"七"));
		userModel.add(new UserModel(8,"八"));
	}

	public List<UserModel> showUser() {
		
		return userModel;
	}

}
