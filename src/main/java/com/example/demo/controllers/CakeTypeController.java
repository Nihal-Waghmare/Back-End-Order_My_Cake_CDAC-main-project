package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.CakeType;

import com.example.demo.services.CakeTypeService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class CakeTypeController {

	@Autowired
	CakeTypeService ctservice;
	
	
	@GetMapping("/getAllCakeTypes")
	public List<CakeType> getAllCakeTypes()
	{
		return ctservice.getAllCakeTypes();
	}
	
	
	
}
