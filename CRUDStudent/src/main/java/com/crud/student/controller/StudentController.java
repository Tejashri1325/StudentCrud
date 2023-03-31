package com.crud.student.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.student.exception.StudentTypeException;
import com.crud.student.model.Student;
import com.crud.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	//This method is used to store the student details.
	 @PostMapping("/save")
	 public ResponseEntity<Student>saveStudent(@RequestBody Student student){
		 Student stu=studentService.saveStudent(student);
		 return ResponseEntity.ok().body(stu);

}
      @GetMapping("/getAll")
		public @ResponseBody Iterable<Student> getAllStudents() throws Exception {
			return studentService.getAllStudent();  //here we are calling //
}
      //This method is used to get the student details  by using student id
      @GetMapping("/get/{id}")
  	public ResponseEntity<Student> getStudentById(@PathVariable("id") Integer id) { //getting data by using id.
  		Optional<Student> student = studentService.getStudentById(id); //method calling
  	    if(student.isPresent()) {
  		return ResponseEntity.ok().body(student.get());
  		}else {
  			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
  		}
  	    
      }
     // This method is used to delete the student details  by using id.
      @DeleteMapping("/delete/{id}")
  	public void deleteStudentById(@PathVariable("id") Integer id) throws StudentTypeException {
  		
    	  studentService.deleteStudent(id);
      }
      
}