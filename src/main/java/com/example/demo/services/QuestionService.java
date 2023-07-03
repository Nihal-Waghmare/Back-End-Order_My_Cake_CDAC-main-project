package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Customer;
import com.example.demo.entites.Login;
import com.example.demo.entites.Question;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	 QuestionRepository qrepo;
	
	@Autowired
	LoginRepository lrepo;
	
	public List<Question> getQuestion()
	{
		return qrepo.findAll();
	}
	
	public Question getQue(int id)
	{
		return qrepo.findById(id).get();
	}
	
	public Question getQuestion(Login l) {
		return qrepo.getQuestion(l);
	}

}
