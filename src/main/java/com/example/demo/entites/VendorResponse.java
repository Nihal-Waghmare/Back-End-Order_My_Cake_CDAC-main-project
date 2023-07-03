package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vendorresponse")
public class VendorResponse {
	
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)	
	int resid;
	double totalprice;
	
	@ManyToOne
	@JoinColumn(name="Recorporateid")
	CorporateCustomer recorporateid;
	
	
	@OneToOne
	@JoinColumn(name="Reqid")
	CorporateRequest reqid;
	
	@ManyToOne
	@JoinColumn(name="RVendorid")
	Vendor vendorid;

	
	
	




	public VendorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
//	public VendorResponse(double totalprice, CorporateRequest reqid, Vendor vendorid) {
//		super();
//		this.totalprice = totalprice;
//		this.reqid = reqid;
//		this.vendorid = vendorid;
//	}
//
//


	public VendorResponse( double totalprice, CorporateCustomer rCorporateid, CorporateRequest reqid, Vendor vendorid) {
		super();
		
		this.totalprice = totalprice;
		this.recorporateid = rCorporateid;
		this.reqid = reqid;
		this.vendorid = vendorid;
	}




	public CorporateCustomer getRecorporateid() {
		return recorporateid;
	}




	public void setRecorporateid(CorporateCustomer recorporateid) {
		this.recorporateid = recorporateid;
	}




	public int getResid() {
		return resid;
	}

	public void setResid(int resid) {
		this.resid = resid;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public CorporateRequest getReqid() {
		return reqid;
	}

	public void setReqid(CorporateRequest reqid) {
		this.reqid = reqid;
	}

	public Vendor getVendorid() {
		return vendorid;
	}

	public void setVendorid(Vendor vendorid) {
		this.vendorid = vendorid;
	}
	
	
	

}
