package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flavor")
public class Flavor {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int flavorid;
	String flavor;
	
	
	
	
	public int getFlavorid() {
		return flavorid;
	}
	public void setFlavorid(int flavorid) {
		this.flavorid = flavorid;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	

}
