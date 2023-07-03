package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.CorporateCustomer;
import com.example.demo.entites.VendorResponse;

@Repository
public interface VendorResponseRepository extends JpaRepository<VendorResponse, Integer> {
	
	@Query("select r from VendorResponse r where recorporateid = :cc ")
	public List<VendorResponse> getAllResponse(CorporateCustomer cc);

}
