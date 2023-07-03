package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="corporatereq")
public class CorporateRequest {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int reqid;
	int noofcakes;
	double weight;
	double maxprice;
	
	@OneToOne
	@JoinColumn(name="RCorporateid")
	CorporateCustomer rcorporateid;
	

	public CorporateRequest() {
		super();
		
	}

	public CorporateRequest(int  noofcakes, double weight, double maxprice, CorporateCustomer rcorporateid) {
		super();
	
		this.noofcakes = noofcakes;
		this.weight = weight;
		this.maxprice = maxprice;
		this.rcorporateid = rcorporateid;
	}


	public int getReqid() {
		return reqid;
	}

	public void setReqid(int reqid) {
		this.reqid = reqid;
	}

	public int getNoofcakes() {
		return noofcakes;
	}

	public void setNoofcakes(int noofcakes) {
		this.noofcakes = noofcakes;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getMaxprice() {
		return maxprice;
	}

	public void setMaxprice(double maxprice) {
		this.maxprice = maxprice;
	}

	public CorporateCustomer getRcorporateid() {
		return rcorporateid;
	}

	public void setRcorporateid(CorporateCustomer rcorporateid) {
		this.rcorporateid = rcorporateid;
	}
	
	
	
	

}
