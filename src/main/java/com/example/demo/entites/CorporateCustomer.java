package com.example.demo.entites;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="corporatecustomer")
public class CorporateCustomer {
    @Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int corporateid;
    String companyname;
    String regno;
    String contactno;
    String addressline;
   
    //@ManyToMany
    @ManyToOne
    @JoinColumn(name="CAreaid")
    Area careaid;
    
    @OneToOne
	@JoinColumn(name="CLoginid")
	Login loginid;
   
    
    
	public CorporateCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CorporateCustomer(String companyname, String regno, String contactno, String addressline, Area careaid,
			Login loginid) {
		super();
		this.companyname = companyname;
		this.regno = regno;
		this.contactno = contactno;
		this.addressline = addressline;
		this.careaid = careaid;
		this.loginid = loginid;
	}





	public int getCorporateid() {
		return corporateid;
	}


	public void setCorporateid(int corporateid) {
		this.corporateid = corporateid;
	}


	public String getCompanyname() {
		return companyname;
	}


	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}


	public String getRegno() {
		return regno;
	}


	public void setRegno(String regno) {
		this.regno = regno;
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


	public Area getAreaid() {
		return careaid;
	}


	public void setAreaid(Area areaid) {
		this.careaid = areaid;
	}


	public Login getLoginid() {
		return loginid;
	}


	public void setLoginid(Login loginid) {
		this.loginid = loginid;
	}



	
	}
	
	

	
	

