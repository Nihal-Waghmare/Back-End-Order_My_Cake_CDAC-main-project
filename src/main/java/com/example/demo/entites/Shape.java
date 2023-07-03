package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shape")
public class Shape {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int shapeid;
	String shape;
	
	
	public int getShapeid() {
		return shapeid;
	}
	public void setShapeid(int shapeid) {
		this.shapeid = shapeid;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}

}
