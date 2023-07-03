package com.example.demo.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Area;

import com.example.demo.entites.Login;
import com.example.demo.entites.PassBasedEnc;
import com.example.demo.entites.Question;
import com.example.demo.entites.Role;
import com.example.demo.entites.SaltValue;
import com.example.demo.entites.Vendor;
import com.example.demo.entites.VendorReg;
import com.example.demo.services.AreaService;

import com.example.demo.services.LoginService;
import com.example.demo.services.QuestionService;
import com.example.demo.services.RoleService;
import com.example.demo.services.VendorService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class VendorController {
	@Autowired
	VendorService vservice;
	
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
	
	
	@GetMapping("/getVendor")
	public Vendor getVendor(@RequestParam("loginid") int vloginid ) {
		
		System.out.println(vloginid);
		Login l = lservice.getbyId(vloginid);
		System.out.println("login"+l);
		return vservice.getVendor(l);	
	}
	
	@GetMapping("/getAllVendor")
	public List<Vendor> getAllVendor()
	{
		return vservice.getAllVendor();
		
	}
	
	@GetMapping("/getVendorApprovalChecklist")
	public List<Vendor> getUnapprovedVendor()
	{
		return vservice.getUnapprovedVendor();
	}
	
	
	@GetMapping("/getApprovedVendor")
	public List<Vendor> getapprovedlist()
	{
		return vservice.getapprovedlist();
	}
	
	@GetMapping("/approve")
	public boolean approveVendor(@RequestParam("vendorid") int vendorid)
	{
		Vendor v=vservice.getVendorById(vendorid);
		v.getVloginid().setStatus(true);
		Vendor c= vservice.registerVendor(v);
		return c.getVloginid().isStatus();
	
		
	}
	
	@GetMapping("/getVendorByid")
	  public Vendor getVendorById(@RequestParam("vendorid") int vendorid)
	  {
		return vservice.getVendorById(vendorid);
	  }
	
	
	@PostMapping("/regVendor")
	public Vendor regVendor(@RequestBody VendorReg v)
	{
		System.out.println(v);
		Role r = rservice.getRole(2);
		System.out.println(saltValue.getSalt());
		String encrypted = PassBasedEnc.generateSecurePassword(v.getPassword(), saltValue.getSalt());
		Question q = qservice.getQue(v.getSecurityid());
		
		
		Login l = new Login(v.getEmail(),encrypted,v.getAns(),q,r,false);
		Login saved = lservice.Save(l);
		
	    Area a = aservice.getArea(v.getAreaid()) ;
	    
		Vendor vn = new Vendor(v.getShopname(),v.getLicence_no(),v.getContactno(),false,v.getAddressline(),a,saved);
		return vservice.Save(vn);
				
				
	}
	
	
	@GetMapping("getAllVendorFromarea")
	public List<Vendor> getVendorByArea(@RequestParam("areaid") int areaid)
	{
		Area a = aservice.getArea(areaid);
		
		return vservice.getVendorByArea(a);
		
	}
}
