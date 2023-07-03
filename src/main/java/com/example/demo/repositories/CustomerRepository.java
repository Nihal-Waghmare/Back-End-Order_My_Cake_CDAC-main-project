package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entites.Customer;
import com.example.demo.entites.Login;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	@Query("select c from Customer c where loginid= :l")
	public Customer getCustomer(Login l);

}
