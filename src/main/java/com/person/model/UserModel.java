package com.person.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="usertable")
public class UserModel {
	public int userID;
    public int age;
    public String name;
    
	
	public UserModel() {
		super();
	}

	public UserModel(int userID, int age, String name) {
		super();
		this.userID = userID;
		this.age = age;
		this.name = name;
	}
	
    @Id
    @Column(name = "userid", unique = true, nullable = false,length = 11)
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	@Column(name = "age",nullable = false, length = 3)
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Column(name = "name",nullable = false, length = 13)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
