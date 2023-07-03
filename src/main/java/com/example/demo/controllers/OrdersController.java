package com.example.demo.controllers;



import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Customer;
import com.example.demo.entites.Orders;
import com.example.demo.entites.Product;
import com.example.demo.entites.OrderDummy;
import com.example.demo.entites.OrderItem;
import com.example.demo.entites.Vendor;
import com.example.demo.services.CustomerService;
import com.example.demo.services.OrderItemService;
import com.example.demo.services.OrdersService;
import com.example.demo.services.VendorService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class OrdersController {

	@Autowired
	OrdersService oservice;
	
	@Autowired
	VendorService vservice;
	
	@Autowired
	CustomerService cservice;
	
	@Autowired
	OrderItemService ois;
	
	
	
	@PostMapping("/addOrders")
	public List<OrderItem> insertOrder(@RequestBody OrderDummy o) throws ParseException
	{
		 System.out.println(o);
		Vendor v = vservice.getVen(o.getVendorid());
		
		Customer c= cservice.getCustomerById(o.getCustomerid());
	
		
		LocalDateTime mydateobj = LocalDateTime.now();
		
		DateTimeFormatter myformatobj= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formateddate= mydateobj.format(myformatobj);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		java.util.Date date= format.parse(formateddate);
		
		
		Orders orders = new Orders(date,o.getAmount(),false,o.getDeliverydate(),o.getDeliverytime(),c,v);
		
		//return oservice.Save(orders);
     
		 Orders savedorder=oservice.Save(orders);
		 OrderItem oi;

		 Iterator<Product>pservic=o.getList().iterator();
		

		 List<OrderItem>loi=new ArrayList<>();
		 
		 while(pservic.hasNext())
		 {
			 oi=new OrderItem(savedorder,pservic.next(),v,c,false);
			 OrderItem soi=ois.insertOrderItems(oi);
			 loi.add(soi);
		 }
	
		 return loi;	
		
	}
	
	
//	@GetMapping("/getAllOrder")
//	public List<Orders> getAllOrder(@RequestParam("customerid")int customerid)
//	{
//		Customer c = cservice.getCustomerById(customerid);
//		return oservice.getAllOrder(c);
//	}
	
	
//	@GetMapping("/getAllordersrequest")
//	public List<Orders> getAllRequest(@RequestParam("vendorid")int vendorid)
//	{
//		Vendor v = vservice.getVen(vendorid);
//		return oservice.getAllRequest(v);
//	}
//	
//	
//	@GetMapping("/getOrderApprovalChecklist")
//	public List<Orders> getUnapprovedOrder(@RequestParam("vendorid") int vendorid)
//	{
//		Vendor v = vservice.getVen(vendorid);
//		return oservice.getUnapprovedOrder(v);
//	}
	
	
//	@GetMapping("/approveOrder")
//	public boolean approveOrder(@RequestParam("orderid") int orderid)
//	{
//
//	   System.out.println(orderid);
//		Orders o = oservice.getOrderById(orderid);
//		o.setStatus(true);
//		
//		System.out.println(o);
//		
//		Orders or = oservice.bookorders(o);
//		
//		return or.isStatus();
//			
//	}
	
	

	
	@GetMapping("/getApprovedOrder")
	public List<Orders> getapprovedlist()
	{
		return oservice.getapprovedlist();
	}
	
	
	
	
	
}