package com.kodnest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{


}
