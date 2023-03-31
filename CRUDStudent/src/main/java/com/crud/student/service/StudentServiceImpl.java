package com.crud.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.student.model.Student;
import com.crud.student.dao.StudentRepository;
import com.crud.student.exception.StudentTypeException;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	public StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student); // return student;;
	}

	@Override
	public Iterable<Student> getAllStudent() {
		return studentRepository.findAll(); // to get the all list;
		
	}

	@Override
	public Optional<Student> getStudentById(Integer Id) {
		Optional<Student> student = studentRepository.findById(Id);
		   
		if(student.isEmpty()) { //6==null or null==null
			throw new StudentTypeException("Student id "+Id+" incorrect..");
		}
		return student;
	}

	@Override
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
		
	}
	

}
