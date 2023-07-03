package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Area;
import com.example.demo.entites.CorporateCustomer;
import com.example.demo.entites.CorporateCustomerReg;
import com.example.demo.entites.Login;
import com.example.demo.entites.PassBasedEnc;
import com.example.demo.entites.Question;
import com.example.demo.entites.Role;
import com.example.demo.entites.SaltValue;
import com.example.demo.entites.Vendor;
import com.example.demo.entites.VendorReg;
import com.example.demo.services.AreaService;
import com.example.demo.services.CorporateCustomerService;
import com.example.demo.services.LoginService;
import com.example.demo.services.QuestionService;
import com.example.demo.services.RoleService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class CorporateCustomerController {
     
	@Autowired
	CorporateCustomerService cservice;
	
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
	
	@GetMapping("/getCorporateCustomer")
	public CorporateCustomer getCorporateCustomer(@RequestParam("loginid") int vloginid ) {
		Login l = lservice.getbyId(vloginid);
		return cservice.getCorporateCustomer(l);
				
	}
	 
	
	@PostMapping("/regCorporateCustomer")
	public CorporateCustomer regCorporateCustomer(@RequestBody CorporateCustomerReg cr)
	{
		Role r = rservice.getRole(3);
		Question q = qservice.getQue(cr.getSecurityid());
		System.out.println(saltValue.getSalt());
		String encrypted = PassBasedEnc.generateSecurePassword(cr.getPassword(), saltValue.getSalt());
		Login l = new Login(cr.getEmail(),encrypted,cr.getAns(),q,r,true);
		Login saved = lservice.Save(l);
		
	    Area a = aservice.getArea(cr.getAreaid()) ;
	    
	    CorporateCustomer cc = new CorporateCustomer(cr.getCompanyname(),cr.getRegno(),cr.getContactno(),cr.getAddressline(),a,saved);
		return cservice.Save(cc);
				
				
	}
	
	
}
