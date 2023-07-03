package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "usertype")
public class Role {
	@Id
	int role_id;
	String role;
	
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
