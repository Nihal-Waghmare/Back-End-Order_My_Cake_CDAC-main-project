package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Customer;
import com.example.demo.entites.Feedback;
import com.example.demo.entites.FeedbackDummy;
import com.example.demo.entites.Product;
import com.example.demo.entites.Vendor;
import com.example.demo.services.CustomerService;
import com.example.demo.services.FeedbackService;
import com.example.demo.services.ProductService;
import com.example.demo.services.VendorService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService fservice;
	
	@Autowired
	CustomerService cservice;
	
	@Autowired
	VendorService vservice;
	
	@Autowired
	ProductService pservice;
	
	
	@PostMapping("addFeedback")
	public Feedback addFeedback(@RequestBody FeedbackDummy f)
	{
		
		Customer c = cservice.getCustomerById(f.getCustomerid());
		
		Vendor v = vservice.getVen(f.getVendorid());
		
		Product p = pservice.getProductByid(f.getProductid());
		
	    Feedback fb = new Feedback(f.getRating(),f.getComment(),c,v,p);
	    
	    return fservice.Save(fb);
		
	       
	}
	
	
	@GetMapping("/getFeedback")
	public List<Feedback> getAllFeedback(@RequestParam("vendorid")int vendorid)
	{
		  Vendor v= vservice.getVen(vendorid);
		  
		  return fservice.getAllFeedback(v);
	}
	

	
	
	
	
	
}
