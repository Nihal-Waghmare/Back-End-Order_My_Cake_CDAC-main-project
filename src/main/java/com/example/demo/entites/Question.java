package com.example.demo.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int queid;
	String squestion;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Question(int queid, String squestion) {
		super();
		this.queid = queid;
		this.squestion = squestion;
	}



	public int getQueid() {
		return queid;
	}
	public void setQueid(int queid) {
		this.queid = queid;
	}
	public String getSquestion() {
		return squestion;
	}
	public void setSquestion(String squestion) {
		this.squestion = squestion;
	}
	
	

}
