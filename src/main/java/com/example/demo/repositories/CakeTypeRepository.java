package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.CakeType;

@Repository
public interface CakeTypeRepository extends JpaRepository<CakeType, Integer> {

}
