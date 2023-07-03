package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entites.Shape;
import com.example.demo.services.ShapeService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class ShapeController {

	@Autowired
	ShapeService sservice;
	
	@PostMapping("/addShape")
	public Shape addShape(@RequestBody Shape s)
	{
		return sservice.Save(s);
	}
	
	
	@GetMapping("/getAllShapes")
	public List<Shape> getAllShapes()
	{
		return sservice.getAllShapes();
	}
	
}
