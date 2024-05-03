package com.kodnest.service;

import java.util.List;

import com.kodnest.entity.Laptop;

public interface LaptopService {
	List<Laptop>getlaptop();

	Laptop getLaptopById(int id);

	void postLaptop(Laptop laptop);

	void deleteLaptop(int id);

	void updateLaptop(int id, Laptop laptop);


}
