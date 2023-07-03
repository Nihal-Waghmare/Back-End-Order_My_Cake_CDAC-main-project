package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Area;
import com.example.demo.entites.Login;
import com.example.demo.entites.Vendor;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.VendorRepository;

@Service
public class VendorService {
	
	@Autowired
	VendorRepository vrepo;
	
	@Autowired
	LoginRepository lrepo;
	
	public Vendor getVendor(Login l) {
		return vrepo.getVendor(l);
	}
	
	public Vendor getVen(int id)
	{
		return vrepo.findById(id).get();
	}
	
	public List<Vendor> getUnapprovedVendor()
	{
		return vrepo.getUnapprovedVendor();
	}
	
	public List<Vendor> getapprovedlist()
	{
		return vrepo.getapprovedlist();
	}
	
	public void setApproval()
	{
		
	}
	
	
	public Vendor registerVendor(Vendor v)
	{
		return vrepo.save(v);
	}
	
	public Vendor getVendorById(int vendorid)
	{
		return vrepo.findById(vendorid).get();
	}
	
	
	
	
	public List<Vendor> getAllVendor()
	{
		return vrepo.findAll();
	}
	
	
	public Vendor Save (Vendor v)
	{
		return vrepo.save(v);
	}
	
	public List<Vendor> getVendorByArea(Area a)
	{
		return vrepo.getVendorByArea(a);
	}

}
