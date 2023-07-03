package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Customer;
import com.example.demo.entites.Orders;
import com.example.demo.entites.Vendor;
import com.example.demo.repositories.OrdersRepository;

@Service
public class OrdersService {
	
	@Autowired
	OrdersRepository orrepo;
	
	
//	public List<Orders> getAllOrder(Customer c)
//	{
//		return orrepo.getAllOrder(c);
//	}
	
	
	public Orders Save(Orders o)
	{
		return orrepo.save(o);
	}
	
	public List<Orders> getAllRequest(Vendor v)
	{
		return orrepo.getAllRequest(v);
	}
	
	
	public Orders getOrderById(int id)
	{
		return orrepo.findById(id).get();
	}
	
	
//	public Orders bookorders(Orders o)
//	{
//		return orrepo.save(o);
//	}

	
	public List<Orders> getUnapprovedOrder(Vendor v)
	{
		return orrepo.getUnapprovedOrder(v);
	}
	
	public List<Orders> getapprovedlist()
	{
		return orrepo.getapprovedlist();
	}	
	
	
}
