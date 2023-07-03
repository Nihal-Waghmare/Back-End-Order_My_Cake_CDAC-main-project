package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.CorporateCustomer;
import com.example.demo.entites.VendorResponse;
import com.example.demo.repositories.VendorResponseRepository;

@Service
public class VendorResponseService {

	@Autowired
	VendorResponseRepository vrrepo;
	
	public VendorResponse Save (VendorResponse vr)
	{
		return vrrepo.save(vr);
	}
	
	
	public List<VendorResponse> getAllResponse(CorporateCustomer cc)
	{
		return vrrepo.getAllResponse(cc);
	}
	
	
}
