package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Flavor;

@Repository
public interface FlavorRepository extends JpaRepository<Flavor, Integer> {

}
