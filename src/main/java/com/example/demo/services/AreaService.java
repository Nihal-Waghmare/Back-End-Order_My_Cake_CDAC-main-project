package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Area;
import com.example.demo.entites.City;
import com.example.demo.entites.Question;
import com.example.demo.repositories.AreaRepository;

@Service
public class AreaService {
      @Autowired
	 AreaRepository arepo;
      
      public List<Area> getAll()
      {
    	  return arepo.findAll();
      }
      
      public Area getArea(int id)
  	{
  		return arepo.findById(id).get();
  	}

      public List<Area> getAreaFromCity(City c)
      {
    	  return arepo.getAreaFromCity(c);
      }
	
	
}
