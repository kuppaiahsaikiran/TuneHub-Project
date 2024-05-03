package com.kodnest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
