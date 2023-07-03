package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Flavor;
import com.example.demo.entites.Shape;
import com.example.demo.repositories.ShapeRepository;

@Service
public class ShapeService {
	
	@Autowired
	ShapeRepository srepo;

	public Shape Save(Shape s)
	{
		return srepo.save(s);
	}

	public List<Shape> getAllShapes()
	{
		return srepo.findAll();
	}

	
	public Shape getShapeById(int id)
	{
		return srepo.findById(id).get();
	}
}
