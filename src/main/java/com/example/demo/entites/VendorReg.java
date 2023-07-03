package com.example.demo.entites;

public class VendorReg {
	
	String shopname;
	String email;
	String password;
	String licence_no;
	String contactno;
	boolean customization;
	String addressline;
	String ans;
	int securityid, areaid;
	
	
	public VendorReg() {
		
	}
	/*public VendorReg( String shopname, String email, String password, String licence_no, String contactno,
			boolean customization, String addressline) {
		super();
		
		this.shopname = shopname;
		this.email = email;
		this.password = password;
		this.licence_no = licence_no;
		this.contactno = contactno;
		this.customization = customization;
		this.addressline = addressline;
	}*/
	
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
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
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
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
	@Override
	public String toString() {
		return "VendorReg [shopname=" + shopname + ", email=" + email + ", password="
				+ password + ", licence_no=" + licence_no + ", contactno=" + contactno + ", customization="
				+ customization + ", addressline=" + addressline + ", ans=" + ans + ", securityid=" + securityid
				+ ", areaid=" + areaid + "]";
	}
	
		
	

}
