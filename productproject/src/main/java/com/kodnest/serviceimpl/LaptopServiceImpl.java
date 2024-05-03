package com.kodnest.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.entity.Laptop;
import com.kodnest.entity.Student;
import com.kodnest.repository.LaptopRepository;
import com.kodnest.service.LaptopService;

@Service
public class LaptopServiceImpl implements LaptopService {

	
		
		
		@Autowired
		LaptopRepository laptopRepository;

		@Override
		public List<Laptop> getlaptop() {
			
			
			return laptopRepository.findAll();
			
			
		}

		@Override
		public Laptop getLaptopById(int id) {

			  Optional<Laptop> laptop = laptopRepository.findById(id);
				
			 return laptop.orElse(null);
			
			
		}

		@Override
		public void postLaptop(Laptop laptop) {
			laptopRepository.save(laptop);
			
		}

		@Override
		public void deleteLaptop(int id) {
			laptopRepository.deleteById(id);
			
		}

		@Override
		public void updateLaptop(int id, Laptop updatinglaptop) {

			Optional<Laptop> existingLaptop = laptopRepository.findById(id);
			
			if(existingLaptop.isPresent()) {
				//updating logic
				
				 Laptop laptop = existingLaptop.get();
				String newname = updatinglaptop.getLname();
				laptop.setLname(newname);
				laptopRepository.save(laptop);
				System.out.println("Update success!");
			}
			else {
				System.out.println("Record is not found!");
			}
		}

		}

	

