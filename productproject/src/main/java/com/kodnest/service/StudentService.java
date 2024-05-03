package com.kodnest.service;

import java.util.List;

import com.kodnest.entity.Student;

public interface StudentService {
	
	List<Student>getstudent();

	Student getStudentById(int id);

	void postStudent(Student student);

	void deleteStudent(int id);

	void updateStudent(int id, Student student);


}
