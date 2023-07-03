package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.City;

public interface CityRepository extends JpaRepository<City, Integer> {

}
