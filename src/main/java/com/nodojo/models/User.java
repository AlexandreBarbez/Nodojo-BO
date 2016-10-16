package com.nodojo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {

	private Long id;
	@JsonIgnore
	private String password;
	private String userName;
	
	User(){ // JPA use only	
	}
	
	public User(String p_pwd, String p_usrNm){
		this.userName = p_usrNm;
		this.password = p_pwd;
	}
	
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	
}
