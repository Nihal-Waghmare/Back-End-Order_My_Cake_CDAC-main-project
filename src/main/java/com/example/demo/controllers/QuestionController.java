package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Customer;
import com.example.demo.entites.Login;
import com.example.demo.entites.Question;
import com.example.demo.services.LoginService;
import com.example.demo.services.QuestionService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class QuestionController {

	@Autowired
	QuestionService qservice;
	
	@Autowired
	LoginService lservice;
	
	@GetMapping("/getQuestion")
	public List<Question> getQuestion()
	{
		return qservice.getQuestion();
	}
	
	@GetMapping("/getQuestionById")
	public Question getQuestion(@RequestParam("loginid") int loginid ) {
		Login l = lservice.getbyId(loginid);
		return qservice.getQuestion(l);
		
	}
		
	
}
