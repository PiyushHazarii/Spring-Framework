package me.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.entity.Student;
import me.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student findByName(String name) {
		Student student = studentRepository.findByName(name);
		return student;
	}   
}
