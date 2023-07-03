package com.example.demo.entites;

import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.example.demo.entites.*;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int customerid;
	String firstname;
	String lastname;
	Date dob;
	String contactno;
	String addressline;
	
	@ManyToOne
	@JoinColumn(name="Areaid")
	Area areaid; 
	
	@OneToOne
	@JoinColumn(name="LoginId")
	Login loginid;


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstname, String lastname, Date dob, String contactno, String addressline, Area areaid,
			Login loginid) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.contactno = contactno;
		this.addressline = addressline;
		this.areaid = areaid;
		this.loginid = loginid;
	}




	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
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

	public Area getVareaid() {
		return areaid;
	}

	public void setVareaid(Area vareaid) {
		this.areaid = vareaid;
	}

	public Login getLoginid() {
		return loginid;
	}

	public void setLoginid(Login loginid) {
		this.loginid = loginid;
	}

	

	
	
	

}
