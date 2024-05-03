package com.kodnest.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kodnest.entity.Student;
import com.kodnest.repository.StudentRepository;
import com.kodnest.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	
	
	
	StudentRepository studentRepository;

	

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getstudent() {
		return studentRepository.findAll();
	}

	
	@Override
	public Student getStudentById(int id) {

		  Optional<Student> student = studentRepository.findById(id);
			
		 return student.orElse(null);
		
		
	}



	@Override
	public void postStudent(Student student) {

		studentRepository.save(student);
	}



	@Override
	public void deleteStudent(int id) {

		studentRepository.deleteById(id);
	}



	@Override
	public void updateStudent(int id, Student updatingstudent) {


		Optional<Student> existingstudent = studentRepository.findById(id);
		
		if(existingstudent.isPresent()) {
			//updating logic
			
			Student student = existingstudent.get();
			String newname = updatingstudent.getSname();
			student.setSname(newname);
			studentRepository.save(student);
			System.out.println("Update success!");
		}
		else {
			System.out.println("Record is not found!");
		}
	}



	}
