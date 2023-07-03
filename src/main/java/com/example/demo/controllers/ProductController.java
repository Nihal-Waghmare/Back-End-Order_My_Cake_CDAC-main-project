package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entites.AddProduct;
import com.example.demo.entites.CakeType;
import com.example.demo.entites.Flavor;
import com.example.demo.entites.Login;
import com.example.demo.entites.Product;
import com.example.demo.entites.Shape;
import com.example.demo.entites.Vendor;
import com.example.demo.services.CakeTypeService;
import com.example.demo.services.FlavorService;
import com.example.demo.services.LoginService;
import com.example.demo.services.ProductService;
import com.example.demo.services.ShapeService;
import com.example.demo.services.VendorService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class ProductController {
	
	@Autowired
	ProductService pservice;
	
	@Autowired
	ShapeService sservice;
	
	@Autowired
	FlavorService fservice;
	
	@Autowired
	CakeTypeService ctservice;
	
	@Autowired
	LoginService lservice;
	
	@Autowired
	VendorService vservice;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody AddProduct p)
	{
		System.out.println(p);
		
		Shape s = sservice.getShapeById(p.getShapeid());
		
		Flavor f = fservice.getFlavorById(p.getFlavorid());
		
		CakeType ct = ctservice.getCakeTypeById(p.getCakeid());
	        
		Vendor v= vservice.getVen(p.getVendorid());
		
		Product pp = new Product(p.getProductname(),p.getPrice(),p.getWeight(),p.isEggeggless(),p.getDescription(),s,f,v,ct);
		
		System.out.println(p);
		
		return pservice.Save(pp); 
		
	}
	
	
	@PostMapping(value="/uploadImage/{did}",consumes= "multipart/form-data")
	public boolean uploadImage(@PathVariable("did") int did, @RequestBody MultipartFile file )
	{
		boolean flag= true;
		try {
			
			flag= pservice.upload(did, file.getBytes());
			
		}
		catch(Exception e)
		{
			flag= false;
		}
		
		return flag;
		
	}
	
	@GetMapping("/getAllProducts")
	public List <Product> getAllProduct()
	{
		return pservice.getAllProduct();
	}
	
	@GetMapping("/getProductsbyVendor")
	public List<Product> getProductsByVendor(@RequestParam("vendorid")int vendorid)
	{
		System.out.println(vendorid);
		Vendor v = vservice.getVen(vendorid);
		return pservice.getProductsByVendor(v);
	}
	
	
	
	@GetMapping("/getProductsbyFlavor")
	public List<Product> getProductsbyFlavor(@RequestParam("flavorid")int flavorid)
	{
		//System.out.println(flavorid);
		return pservice.getProductsbyFlavor(flavorid);
	}
		
	
	@DeleteMapping("/deleteProduct")
	public void deleteProduct(@RequestParam("productid")int productid)
	{
		
		 pservice.deleteProduct(productid);
		
	}
	

}
