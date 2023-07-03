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
import com.example.demo.entites.SendRequest;
import com.example.demo.services.CorporateCustomerService;
import com.example.demo.services.CorporateRequestService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CorporateRequestController {

	  @Autowired
	  CorporateRequestService crservice;
	  
	  @Autowired
	  CorporateCustomerService ccservice;
	  
	  
	  
	  @PostMapping("/sendRequest")
	  public CorporateRequest sendRequest(@RequestBody SendRequest sr)
	  {
		  System.out.println(sr);
		  CorporateCustomer cc = ccservice.getCorporateById(sr.getRcorporateid());
		  
		  CorporateRequest  cr= new CorporateRequest (sr.getNoofcakes(),sr.getWeight(),sr.getMaxprice(),cc);
		  
		  return crservice.Save(cr);
	  }
	  
	  @GetMapping("/getAllRequest")
	  public List<CorporateRequest> getAllrequest()
	  {
	      return crservice.getAllrequest();
      }
	  
	  
	  @GetMapping("/getRequestById")
	  public CorporateRequest getRequestById(@RequestParam("reqid")int reqid)
	  {
		  
		  return crservice.getRequestById(reqid);
	  }
	  
	  
	  
	  
	  
}
