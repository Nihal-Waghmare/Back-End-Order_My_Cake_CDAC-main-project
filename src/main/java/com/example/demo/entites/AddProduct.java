package com.example.demo.entites;

public class AddProduct {
	
	int loginid;
	String productname;
	double price;
	double weight;
	byte image;
	boolean eggeggless;
	String description;	
	int flavorid;
	int shapeid;
	int cakeid;
	int vendorid;
	

	public AddProduct() {
		super();
		
	}
	public AddProduct(String productname, double price, double weight, byte image, boolean eggeggless,
			String description, int flavorid, int shapeid, int cakeid, int vendorid) {
		super();
		this.productname = productname;
		this.price = price;
		this.weight = weight;
		this.image = image;
		this.eggeggless = eggeggless;
		this.description = description;
		this.flavorid = flavorid;
		this.shapeid = shapeid;
		this.cakeid = cakeid;
		this.vendorid = vendorid;
	}
	public int getVendorid() {
		return vendorid;
	}
	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
	}
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public byte getImage() {
		return image;
	}
	public void setImage(byte image) {
		this.image = image;
	}
	public boolean isEggeggless() {
		return eggeggless;
	}
	public void setEggeggless(boolean eggeggless) {
		this.eggeggless = eggeggless;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getFlavorid() {
		return flavorid;
	}
	public void setFlavorid(int flavorid) {
		this.flavorid = flavorid;
	}
	public int getShapeid() {
		return shapeid;
	}
	public void setShapeid(int shapeid) {
		this.shapeid = shapeid;
	}
	public int getCakeid() {
		return cakeid;
	}
	public void setCakeid(int caketypeid) {
		this.cakeid = caketypeid;
	}
	
	
	
	
	
	
}
