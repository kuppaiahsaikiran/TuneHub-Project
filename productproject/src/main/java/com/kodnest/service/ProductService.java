package com.kodnest.service;

import java.util.List;

import com.kodnest.entity.Product;

public interface ProductService {
	List<Product>getproduct();

	Product getProductById(int id);


	void postProduct(Product product);

	void deleteProduct(int id);

	void updateProduct(int id, Product product);

}
