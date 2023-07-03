package com.example.demo.entites;

import javax.annotation.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int loginid;	
	String email;
	String password;
	String ans;
	
	@OneToOne
	@JoinColumn(name="Queid")
	Question queid;
	
	@ManyToOne
	@JoinColumn(name="Role_Id")
	Role role_id;
	
	boolean status;
	
	

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(String email, String password, String ans, Question queid, Role role_id, boolean status) {
		super();
		this.email = email;
		this.password = password;
		this.ans = ans;
		this.queid = queid;
		this.role_id = role_id;
		this.status = status;
	}

	public int getLoginid() {
		return loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Question getQueid() {
		return queid;
	}

	public void setQueid(Question queid) {
		this.queid = queid;
	}

	public Role getRole_id() {
		return role_id;
	}

	public void setRole_id(Role role_id) {
		this.role_id = role_id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	



	

	
	
	

}
