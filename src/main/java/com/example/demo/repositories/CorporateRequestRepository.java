package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.CorporateRequest;

@Repository
public interface CorporateRequestRepository extends JpaRepository<CorporateRequest, Integer> {

}
