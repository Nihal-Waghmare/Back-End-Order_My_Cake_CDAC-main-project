package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.CorporateRequest;
import com.example.demo.repositories.CorporateRequestRepository;

@Service
public class CorporateRequestService {
	
	@Autowired
	CorporateRequestRepository crrepo;
	
	
	public CorporateRequest Save(CorporateRequest cr)
	{
		return crrepo.save(cr);
	}
	
	public List<CorporateRequest> getAllrequest()
	{
		return crrepo.findAll();
	}
	
	
	public CorporateRequest getReqid(int id)
	{
		return crrepo.findById(id).get();
	}
	
	public CorporateRequest getRequestById(int reqid)
	{
		return crrepo.findById(reqid).get();
	}

}
