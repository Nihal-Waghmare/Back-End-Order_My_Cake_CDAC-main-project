package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Feedback;
import com.example.demo.entites.Vendor;
import com.example.demo.repositories.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	FeedbackRepository frepo;
	
	public Feedback Save(Feedback f)
	{
		return frepo.save(f);
	}
	
	
	public List<Feedback> getAllFeedback(Vendor v)
	{
		return frepo.getAllFeedback(v);
	}
	
	
	
}
