package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Shape;

@Repository
public interface ShapeRepository extends JpaRepository<Shape, Integer> {

}
