package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.criteria.Order;

@Entity
@Table(name="orderitem")
public class OrderItem {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int orderitemid;
	
	@ManyToOne
	@JoinColumn(name="oorderid")
	Orders orderid;
	
	@OneToOne
	@JoinColumn(name="oproductid")
	Product oproductid;
	
	@ManyToOne
	@JoinColumn(name="oivendorid")
	Vendor oivendorid;
	
	@ManyToOne
	@JoinColumn(name="oicustomerid")
	Customer oicustomerid;

	boolean status;
	
	public OrderItem() {
		super();
		
	}

	

	public OrderItem(Orders orderid, Product oproductid, Vendor oivendorid, Customer oicustomerid, boolean status) {
		super();
		this.orderid = orderid;
		this.oproductid = oproductid;
		this.oivendorid = oivendorid;
		this.oicustomerid = oicustomerid;
		this.status = status;
	}



	public int getOrderitemid() {
		return orderitemid;
	}

	public void setOrderitemid(int orderitemid) {
		this.orderitemid = orderitemid;
	}

	public Orders getOrderid() {
		return orderid;
	}

	public void setOrderid(Orders orderid) {
		this.orderid = orderid;
	}

	public Product getOproductid() {
		return oproductid;
	}

	public void setOproductid(Product oproductid) {
		this.oproductid = oproductid;
	}

	public Vendor getOivendorid() {
		return oivendorid;
	}

	public void setOivendorid(Vendor oivendorid) {
		this.oivendorid = oivendorid;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Customer getOicustomerid() {
		return oicustomerid;
	}

	public void setOicustomerid(Customer oicustomerid) {
		this.oicustomerid = oicustomerid;
	}
	
	
	
	
	
	
	
}