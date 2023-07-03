package com.example.demo.entites;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="city")
public class City {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int cityid;
	String cityname;
	
	
	
	public int getCityid() {
		return cityid;
	}
	
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	

	

}
