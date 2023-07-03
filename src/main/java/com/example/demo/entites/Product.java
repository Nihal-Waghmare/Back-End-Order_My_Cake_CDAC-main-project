package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)	
	int productid;
	String productname;
	double price;
	double weight;
	byte [] image;
	boolean eggeggless;
	String description;
	
	@ManyToOne
	@JoinColumn(name="Shapeid")
	Shape shapeid;
	
	@ManyToOne
	@JoinColumn(name="PFlavorid")
	Flavor flavorid;
	
	@ManyToOne
	@JoinColumn(name="PVendorid")
	Vendor vendorid;
	
	@ManyToOne
	@JoinColumn(name="Cakeid")
	CakeType cakeid;

	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Product( String productname, double price, double weight, boolean eggeggless,
			String description, Shape shapeid, Flavor flavorid ,Vendor vendorid, CakeType cakeid) {
		super();
	
		this.productname = productname;
		this.price = price;
		this.weight = weight;
	   // this.image = image;
		this.eggeggless = eggeggless;
		this.description = description;
		this.shapeid = shapeid;
		this.flavorid = flavorid;
	   this.vendorid = vendorid;
		this.cakeid = cakeid;
	}






	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
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

	public Shape getShapeid() {
		return shapeid;
	}

	public void setShapeid(Shape shapeid) {
		this.shapeid = shapeid;
	}

	public Flavor getFlavorid() {
		return flavorid;
	}

	public void setFlavorid(Flavor flavorid) {
		this.flavorid = flavorid;
	}

	public Vendor getVendorid() {
		return vendorid;
	}

	public void setVendorid(Vendor vendorid) {
		this.vendorid = vendorid;
	}

	public CakeType getCake() {
		return cakeid;
	}

	public void setCake(CakeType cake) {
		this.cakeid = cake;
	}


	@Override
	public String toString() {
		return "Product [ productname=" + productname + ", price=" + price + ", weight="
				+ weight + ", image=" + image + ", eggeggless=" + eggeggless + ", description=" + description
				+ ", shapeid=" + shapeid + ", flavorid=" + flavorid + ", vendorid=" + vendorid + ", cakeid=" + cakeid
				+ "]";
	}

	
	
}
