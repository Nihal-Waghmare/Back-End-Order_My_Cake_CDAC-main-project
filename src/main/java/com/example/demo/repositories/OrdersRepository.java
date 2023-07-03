package com.example.demo.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Customer;
import com.example.demo.entites.Orders;
import com.example.demo.entites.Vendor;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

	
	@Query("select r from Orders  r where r.ovendorid = :vendorid")
	public List<Orders> getAllRequest(Vendor vendorid);
	
	@Query("update Orders o set orderid.status= true where orderid=:orderid")
	public void setApprovedOrder(int orderid);
	
	@Query("select o from Orders o where orderid.status = false and orderid.ovendorid= :vendorid")
	public List<Orders> getUnapprovedOrder(Vendor vendorid); 
	
	@Query("select o from Orders o where orderid.status= true")
	public List<Orders> getapprovedlist();
	
//	@Query("select o from Orders o where ocustomerid = :c and orderid.status= true")
//	public List<Orders> getAllOrder(Customer c);
	

}
