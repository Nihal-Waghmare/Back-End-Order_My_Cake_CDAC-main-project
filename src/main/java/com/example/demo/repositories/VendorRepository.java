package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Area;
import com.example.demo.entites.Login;
import com.example.demo.entites.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {
	
	@Query("select v from Vendor v where vloginid= :l")
	public Vendor getVendor(Login l);
	
	@Query("select v from Vendor v where vloginid.status= false")
	public List<Vendor> getUnapprovedVendor(); 
	
	@Query("select v from Vendor v where vloginid.status= true")
	public List<Vendor> getapprovedlist();
	
	
	@Query("update Vendor v set vloginid.status= true where vendorid=:vendorid")
	public void setApprovedVendor(int vendorid);
	
	@Query("select v from Vendor v where vareaid= :a")
	public List<Vendor> getVendorByArea(Area a);
	
	

	
	
	
	
}
