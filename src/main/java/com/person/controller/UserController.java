package com.person.controller;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.person.model.UserModel;
import com.person.service.inte.UserServiceInte;

@Scope("prototype")
@Controller("showUserController")
public class UserController extends ActionSupport{
	
	
	private UserServiceInte userServiceImpl;
	
	@Autowired
	@Qualifier("userServiceImpl")
	public void setUserServiceImpl(UserServiceInte userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	public String showUser() {
		List<UserModel> list =userServiceImpl.showUser();
		Map session = ActionContext.getContext().getSession();
		session.put("user", list);
		return SUCCESS;  
    }


}