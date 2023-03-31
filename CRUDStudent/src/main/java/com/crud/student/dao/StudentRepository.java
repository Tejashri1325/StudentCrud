package com.crud.student.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.crud.student.model.Student;

public interface StudentRepository extends CrudRepository<Student,Serializable> {

}

