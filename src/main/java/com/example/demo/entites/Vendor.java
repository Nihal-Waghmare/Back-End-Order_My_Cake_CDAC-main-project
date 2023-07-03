package com.example.demo.entites;

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
@Table(name="vendor")
public class Vendor {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int vendorid;
	String shopname;
	String licence_no;
	String contactno;
	boolean customization;
	String addressline;
	
	@ManyToOne
	@JoinColumn(name="VAreaid")
	Area vareaid; 
	
	@OneToOne
	@JoinColumn(name="VLoginid")
	Login vloginid;
	

	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendor(String shopname, String licence_no, String contactno, boolean customization, String addressline,
			Area vareaid, Login vloginid) {
		super();
		this.shopname = shopname;
		this.licence_no = licence_no;
		this.contactno = contactno;
		this.customization = customization;
		this.addressline = addressline;
		this.vareaid = vareaid;
		this.vloginid = vloginid;
	}

	public int getVendorid() {
		return vendorid;
	}

	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getLicence_no() {
		return licence_no;
	}

	public void setLicence_no(String licence_no) {
		this.licence_no = licence_no;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public boolean isCustomization() {
		return customization;
	}

	public void setCustomization(boolean customization) {
		this.customization = customization;
	}

	public String getAddressline() {
		return addressline;
	}

	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}

	public Area getVareaid() {
		return vareaid;
	}

	public void setVareaid(Area vareaid) {
		this.vareaid = vareaid;
	}

	public Login getVloginid() {
		return vloginid;
	}

	public void setVloginid(Login vloginid) {
		this.vloginid = vloginid;
	}
	
	
	
	
	

}
