package com.crud.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

	@ResponseStatus(HttpStatus.NOT_FOUND)  //id is incorrect
	public class StudentTypeException extends RuntimeException {
		
		private static final long serialVersionUID = 1L;

		public StudentTypeException(String message){
			super(message); //calling
		}

}

