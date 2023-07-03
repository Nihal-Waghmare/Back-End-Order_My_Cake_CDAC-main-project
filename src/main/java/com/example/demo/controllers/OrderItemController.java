package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Customer;
import com.example.demo.entites.OrderItem;
import com.example.demo.entites.Orders;
import com.example.demo.entites.Vendor;
import com.example.demo.services.CustomerService;
import com.example.demo.services.OrderItemService;
import com.example.demo.services.VendorService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class OrderItemController {
  
	@Autowired
	OrderItemService oiservice;
	
	@Autowired
	VendorService vservice;
	
	@Autowired
	CustomerService  cservice;
	
	@GetMapping("/getAllordersrequest")
	public List<OrderItem> getAllRequest(@RequestParam("vendorid")int vendorid)
	{
		Vendor v = vservice.getVen(vendorid);
		System.out.println("---------------------------------------------------------");
		System.out.println(v);
		return oiservice.getAllRequest(v);
	}
	
	
	
	@GetMapping("/getOrderApprovalChecklist")
	public List<OrderItem> getUnapprovedOrder(@RequestParam("vendorid") int vendorid)
	{
		Vendor v = vservice.getVen(vendorid);
		return oiservice.getUnapprovedOrder(v);
	}
	
	
	@GetMapping("/getAllOrder")
	public List<OrderItem> getAllOrder(@RequestParam("customerid")int customerid)
	{
		Customer c = cservice.getCustomerById(customerid);
		return oiservice.getAllOrder(c);
	}
	
	
	
	
	@GetMapping("/approveOrder")
	public boolean approveOrder(@RequestParam("orderid") int orderitemid)
	{

	   System.out.println(orderitemid);
		OrderItem o = oiservice.getOrderById(orderitemid);
		o.setStatus(true);
		
		System.out.println(o);
		
		OrderItem or = oiservice.bookorders(o);
		
		return or.isStatus();
			
	}
	
	
	
	
	
	
	
}