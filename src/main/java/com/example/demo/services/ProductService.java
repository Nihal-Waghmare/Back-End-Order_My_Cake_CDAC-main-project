package com.example.demo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Product;
import com.example.demo.entites.Vendor;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {
     
	@Autowired
	ProductRepository prepo;
	
	public Product Save(Product p)
	{
		return prepo.save(p);
	}
	
	
	public boolean upload(int id, byte [] photo)
	{
		if(prepo.uploadPhoto(id, photo)==1)
			return true;
		
		else
			return false;
	}
	
	public List <Product> getAllProduct()
	{
		return prepo.findAll();
	}
	
	
	public List<Product> getProductsByVendor(Vendor v)
	{
		return prepo.getProductsByVendor(v);
	}
	
	public List<Product> getProductsbyFlavor(int id)
	{
		return prepo.getProductsbyFlavor(id);
	}
	
	public void deleteProduct(int productid)
	{
		 prepo.deleteById(productid);;
	}
	
	public Product getProductByid(int id)
	{
		return prepo.findById(id).get();
	}
	
	
	
}
