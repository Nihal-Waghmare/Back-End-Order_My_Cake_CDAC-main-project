package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="caketype")
public class CakeType {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int cakeid;
	
	String caketype;

	public int getCakeid() {
		return cakeid;
	}

	public void setCakeid(int cakeid) {
		this.cakeid = cakeid;
	}

	public String getCaketype() {
		return caketype;
	}

	public void setCaketype(String caketype) {
		this.caketype = caketype;
	}
	
	
	

}
