package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Flavor;
import com.example.demo.services.FlavorService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class FlavorController {
	
	@Autowired
	FlavorService fservice;
	
	
	@PostMapping("/addFlavor")
	public Flavor addFlavor(@RequestBody Flavor f)
	{
		return fservice.Save(f);
	}
	
	
	@GetMapping("/getAllFlavor")
	public List<Flavor> getAllFlavor()
	{
		return fservice.getAllFlavor();
	}
	
	

}
