package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.CorporateCustomer;
import com.example.demo.entites.Login;

@Repository
public interface CorporateCustomerrRepository extends JpaRepository<CorporateCustomer, Integer> {

	@Query("select c from CorporateCustomer c where CLoginId= :l ")
	public CorporateCustomer getCorporateCustomer(Login l );
}
