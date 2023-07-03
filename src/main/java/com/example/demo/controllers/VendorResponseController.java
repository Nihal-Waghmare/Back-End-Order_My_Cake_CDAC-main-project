package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.CorporateCustomer;
import com.example.demo.entites.CorporateRequest;
import com.example.demo.entites.Vendor;
import com.example.demo.entites.VendorResponse;
import com.example.demo.entites.VendorResponseDummy;
import com.example.demo.services.CorporateCustomerService;
import com.example.demo.services.CorporateRequestService;
import com.example.demo.services.VendorResponseService;
import com.example.demo.services.VendorService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class VendorResponseController {

	@Autowired
	VendorResponseService vrservice;
	
	@Autowired
	CorporateRequestService crservice;
	
	@Autowired
	CorporateCustomerService ccservice;
	
	@Autowired
	VendorService vservice;
	
	@PostMapping("/sendResponse")
	public VendorResponse sendResponse(@RequestBody VendorResponseDummy vr)
	{
		System.out.println("***************************");
		System.out.println(vr);
		  CorporateRequest rqid = crservice.getReqid(vr.getReqid());
		  
		  CorporateCustomer cc= ccservice.getCorporateById(vr.getRcorporateid());
		  Vendor v = vservice.getVen(vr.getVendorid());
		  
		
			VendorResponse vres = new VendorResponse(vr.getTotalprice(),cc,rqid,v);
		return vrservice.Save(vres);
	}
	
	@GetMapping("/getAllResponse")
	public List<VendorResponse> getAllResponse(@RequestParam("corporateid") int corporateid)
	{
		CorporateCustomer cc = ccservice.getCorporateById(corporateid);
		return vrservice.getAllResponse(cc);
	}
	

	
}
