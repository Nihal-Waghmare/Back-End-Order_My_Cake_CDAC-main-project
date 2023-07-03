package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Flavor;
import com.example.demo.repositories.FlavorRepository;

@Service
public class FlavorService {
	
	@Autowired
	FlavorRepository frepo;
	
	
	public Flavor Save(Flavor f)
	{
		return frepo.save(f);
	}

	public List<Flavor> getAllFlavor()
	{
		return frepo.findAll();
	}
	
	public Flavor getFlavorById(int id)
	{
		return frepo.findById(id).get();
	}
	
}
