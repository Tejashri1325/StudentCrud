package com.crud.student.service;

import java.util.Optional;

import com.crud.student.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public Iterable<Student> getAllStudent(); 
	public Optional<Student> getStudentById(Integer Id);
	public void deleteStudent(Integer id);
	

}
