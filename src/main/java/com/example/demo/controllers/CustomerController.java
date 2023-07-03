package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Area;
import com.example.demo.entites.Customer;
import com.example.demo.entites.CustomerReg;
import com.example.demo.entites.Login;
import com.example.demo.entites.PassBasedEnc;
import com.example.demo.entites.Question;
import com.example.demo.entites.Role;
import com.example.demo.entites.SaltValue;
import com.example.demo.services.AreaService;
import com.example.demo.services.CustomerService;
import com.example.demo.services.LoginService;
import com.example.demo.services.QuestionService;
import com.example.demo.services.RoleService;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CustomerController {
	
		@Autowired
		CustomerService cservice;
		
		@Autowired
		LoginService lservice;
		
		@Autowired
		RoleService rservice;
		
		@Autowired
		QuestionService qservice;
		
		@Autowired
		AreaService aservice;
		
		@Autowired
		SaltValue saltValue;
		
		@GetMapping("/getCustomer")
		public Customer getCustomer(@RequestParam("loginid") int loginid ) {
			Login l = lservice.getbyId(loginid);
			return cservice.getCustomer(l);
			
		}
			
		@PostMapping("/regCustomer")
		public Customer regCustomer(@RequestBody CustomerReg c)
		{
			System.out.println(c);
			Role r = rservice.getRole(1);
			Question q = qservice.getQue(c.getSecurityid());
			System.out.println(saltValue.getSalt());
			String encrypted = PassBasedEnc.generateSecurePassword(c.getPassword(), saltValue.getSalt());
			Login l = new Login(c.getEmail(),encrypted,c.getAns(),q,r,true);
			Login saved = lservice.Save(l);
			
		    Area a = aservice.getArea(c.getAreaid()) ;
		    
			Customer vn = new Customer(c.getFirstname(), c.getLastname(),c.getDob(),c.getContactno(),c.getAddressline(),a,saved);
			return cservice.Save(vn);
			
					
					
		}
	}


