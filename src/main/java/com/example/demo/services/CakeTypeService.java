package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.CakeType;

import com.example.demo.repositories.CakeTypeRepository;

@Service
public class CakeTypeService {

	@Autowired
	CakeTypeRepository ctrepo;
	
	
	public List<CakeType>getAllCakeTypes()
	{
		return ctrepo.findAll();
	}
	
	public CakeType getCakeTypeById(int id)
	{
		return ctrepo.findById(id).get();
	}
	
	
}
