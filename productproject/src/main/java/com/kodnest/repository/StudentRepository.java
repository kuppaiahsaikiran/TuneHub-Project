package com.kodnest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>{

	
}
