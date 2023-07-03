package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Customer;
import com.example.demo.entites.Login;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.LoginRepository;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository crepo;
	
	@Autowired
	LoginRepository lrepo;
	
	public Customer getCustomer(Login l) {
		return crepo.getCustomer(l);
	}
	
	public Customer Save (Customer v)
	{
		return crepo.save(v);
	}
	
	public Customer getCustomerById(int id)
	{
		return crepo.findById(id).get();
	}

}
