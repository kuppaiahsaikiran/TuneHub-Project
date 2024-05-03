package com.kodnest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.entity.Product;
import com.kodnest.entity.Student;
import com.kodnest.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping (value="/products")
	public List<Product> getProduct() {
		return productService.getproduct();
		
		
	}
	@GetMapping (value="/products/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.getProductById(id);
		
		
	}

	
	@PostMapping (value="/products/post")
	public void postProduct(@RequestBody Product product) {
		System.out.println(product);
		 productService.postProduct(product);
		
		
	}

	@DeleteMapping(value="/product/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		System.out.println(id);
		productService.deleteProduct(id);
	}
	
	@PutMapping (value="/product/update/{id}")
	public void updateProduct(@PathVariable int id,@RequestBody Product product) {
		System.out.println(id);
		System.out.println(product);
		productService.updateProduct(id,product);
	}
}
