package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Login;
import com.example.demo.entites.Question;
import com.example.demo.repositories.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository lrepo; 
	
	public Login getLogin(String email,String password) {
		Login l;
		Optional<Login> ol= lrepo.getLogin(email, password);
		try {
			l=ol.get();
		}
		catch (Exception e) {
			
			l=null;
		}
		return l;
	}
	
	public Login getbyId(int loginid) {
		return lrepo.findById(loginid).get();
	}
	
	public Login Save(Login l) {
		return lrepo.save(l);
	}
	
	
	
	
	
	
	

}
