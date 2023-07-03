package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Feedback;
import com.example.demo.entites.Vendor;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

	
	@Query("select f from Feedback f where fvendorid = :vendor")
	public List<Feedback> getAllFeedback(Vendor vendor);
}
