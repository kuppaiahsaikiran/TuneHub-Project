package com.kodnest.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.entity.Product;
import com.kodnest.repository.ProductRepository;
import com.kodnest.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getproduct() {
		
		
		return productRepository.findAll();
		
		
	}

	@Override
	public Product getProductById(int id) {

	 Optional<Product> product = productRepository.findById(id);
		
	 return product.orElse(null);
	}

	

	@Override
	public void postProduct(Product product) {

		productRepository.save(product);
	}

	@Override
	public void deleteProduct(int id) {

		productRepository.deleteById(id);
	}

	@Override
	public void updateProduct(int id, Product updatingproduct) {
Optional<Product> existingproduct = productRepository.findById(id);
		
		if(existingproduct.isPresent()) {
			//updating logic
			
			 Product product = existingproduct.get();
			String newname = updatingproduct.getPname();
			product.setPname(newname);
			productRepository.save(product);
			System.out.println("Update success!");
		}
		else {
			System.out.println("Record is not found!");
		}
	}

		
	}

	
