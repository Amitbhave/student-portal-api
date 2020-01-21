package com.amit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.dto.Student;
import com.amit.repo.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public List<Student> getAllStudents(){
		List<Student> students = new ArrayList<>();
		studentRepo.findAll().forEach(student -> students.add(student));
		return students;
	}
	
	public void addStudent(Student student) {
		studentRepo.save(student);
	}

}
