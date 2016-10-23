package com.nodojo.models;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@JsonIgnore
	private String password;
	private String userName;
	
	protected User(){ // JPA use only	
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
	@Override
    public String toString() {
        return String.format(
                "User[id=%d, userName='%s', password='%s']",
                id, userName, password);
    }
	
}
