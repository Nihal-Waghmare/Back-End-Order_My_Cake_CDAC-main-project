package com.example.demo.entites;

import java.util.Date;

public class CustomerReg {
	
	String firstname;
	String lastname;
	String email;
	String password;
	String ans;
	Date dob;
	String contactno;
	String addressline;
	int securityid, areaid;
	
	
	public int getSecurityid() {
		return securityid;
	}


	public void setSecurityid(int securityid) {
		this.securityid = securityid;
	}


	public int getAreaid() {
		return areaid;
	}


	public void setAreaid(int areaid) {
		this.areaid = areaid;
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



	
	
	public CustomerReg() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getContactno() {
		return contactno;
	}


	public void setContactno(String contactno) {
		this.contactno = contactno;
	}


	public String getAddressline() {
		return addressline;
	}


	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}


	public String getAns() {
		return ans;
	}


	public void setAns(String ans) {
		this.ans = ans;
	}


	

}
