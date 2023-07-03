package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.City;
import com.example.demo.repositories.CityRepository;

@Service
public class CityService {

	@Autowired
	CityRepository crepo;
	
	public List<City> getAllCities()
	{
		return crepo.findAll();
	}
	
	public City getById(int cityid)
	{
		return crepo.findById(cityid).get();
				
	}
	

}
