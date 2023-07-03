package com.example.demo.entites;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Timer;



public class OrderDummy {

	int orderid;
	Date orderdate;
	double amount;
	boolean status;
	Date deliverydate;
	Time deliverytime;
	int customerid;
	int vendorid;
	List<Product> list;
	
	
	
	
	
	public List<Product> getList() {
		return list;
	}
	public void setList(List<Product> list) {
		this.list = list;
	}
	public Time getDeliverytime() {
		return deliverytime;
	}
	public void setDeliverytime(Time deliverytime) {
		this.deliverytime = deliverytime;
	}
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
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getVendorid() {
		return vendorid;
	}
	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
	}
	public Date getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}

	
	
	
	
}
