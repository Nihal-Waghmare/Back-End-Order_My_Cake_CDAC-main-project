package com.example.demo.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Customer;
import com.example.demo.entites.Login;
import com.example.demo.entites.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

	/*@Query("select q from question q")
	public List<Question> findQues();*/
	
	@Query("select q from Question q where loginid= :l")
	public Question getQuestion(Login l);
	
}
