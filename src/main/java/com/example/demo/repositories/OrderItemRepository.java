package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Customer;
import com.example.demo.entites.OrderItem;
import com.example.demo.entites.Orders;
import com.example.demo.entites.Vendor;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

	
	@Query("select r from OrderItem  r where r.oivendorid = :vendorid")
	public List<OrderItem> getAllRequest(Vendor vendorid);
	
	
	@Query("select o from OrderItem o where orderitemid.status = false and orderitemid.oivendorid= :vendorid")
	public List<OrderItem> getUnapprovedOrder(Vendor vendorid); 
	
	@Query("select o from OrderItem o where oicustomerid = :c and orderitemid.status= true")
	public List<OrderItem> getAllOrder(Customer c);
	
	
}