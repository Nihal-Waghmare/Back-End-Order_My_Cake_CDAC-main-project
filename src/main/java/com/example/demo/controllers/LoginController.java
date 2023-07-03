package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Login;
import com.example.demo.entites.PassBasedEnc;
import com.example.demo.entites.Question;
import com.example.demo.entites.SaltValue;
import com.example.demo.services.LoginService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class LoginController {
	@Autowired
	LoginService lservice;
	
	@Autowired
	SaltValue saltValue;
	
	@PostMapping("/chkLogin")
	public Login chkLogin(@RequestBody Login lcheck) throws Exception
	{
		System.out.println(saltValue.getSalt());
		String encrypted = PassBasedEnc.generateSecurePassword(lcheck.getPassword(), saltValue.getSalt());
		return lservice.getLogin(lcheck.getEmail(),encrypted);
	}
	
	

	
	
	
}
