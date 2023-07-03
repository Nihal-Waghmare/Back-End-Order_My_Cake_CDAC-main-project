package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entites.Customer;
import com.example.demo.entites.OrderItem;
import com.example.demo.entites.Orders;
import com.example.demo.entites.Vendor;
import com.example.demo.repositories.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	OrderItemRepository oirepo;
	
	@Autowired
	CustomerService cservice;
	
	public OrderItem insertOrderItems(OrderItem oi)
	{
		return oirepo.save(oi);
	}
	
	public List<OrderItem> getAllRequest(Vendor v)
	{
		return oirepo.getAllRequest(v);
	}
	
	
	public List<OrderItem> getUnapprovedOrder(Vendor v)
	{
		return oirepo.getUnapprovedOrder(v);
	}
	
	
	
	public List<OrderItem> getAllOrder(Customer c)
	{
		return oirepo.getAllOrder(c);
	}
	
	public OrderItem getOrderById(int id)
	{
		return oirepo.findById(id).get();
	}
	
	public OrderItem bookorders(OrderItem o)
	{
		return oirepo.save(o);
	}
	
	
	
	
	
	
}