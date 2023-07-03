package com.example.demo.entites;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="orders")
public class Orders {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int orderid;
	
	Date orderdate;
	double amount;
	boolean status;
	Date deliverydate;
	
	//Time deliverytime;
	
	@OneToOne
	@JoinColumn(name="OCustomerid")
	Customer ocustomerid;
	
	@OneToOne
	@JoinColumn(name="OVendorid")
	Vendor ovendorid;

	
	public Orders() {
		super();
	
	}

	public Orders(Date orderdate, double amount, boolean status, Date deliverydate, Customer ocustomerid,
			Vendor ovendorid) {
		super();
		this.orderdate = orderdate;
		this.amount = amount;
		this.status = status;
		this.deliverydate = deliverydate;
		this.ocustomerid = ocustomerid;
		this.ovendorid = ovendorid;
	}




//	public Time getDeliverytime() {
//		return deliverytime;
//	}


	public Orders(Date orderdate, double amount, boolean status, Date deliverydate, Time deliverytime,
			Customer ocustomerid, Vendor ovendorid) {
		super();
		this.orderdate = orderdate;
		this.amount = amount;
		this.status = status;
		this.deliverydate = deliverydate;
		//this.deliverytime = deliverytime;
		this.ocustomerid = ocustomerid;
		this.ovendorid = ovendorid;
	}




//	public void setDeliverytime(Time deliverytime) {
//		this.deliverytime = deliverytime;
//	}




	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}


	public Date getDeliverydate() {
		return deliverydate;
	}

	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}

	

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	

	public Customer getOcustomerid() {
		return ocustomerid;
	}

	public void setOcustomerid(Customer ocustomerid) {
		this.ocustomerid = ocustomerid;
	}

	public Vendor getVcustomerid() {
		return ovendorid;
	}

	public void setVcustomerid(Vendor vcustomerid) {
		this.ovendorid = vcustomerid;
	}
	
	

}
