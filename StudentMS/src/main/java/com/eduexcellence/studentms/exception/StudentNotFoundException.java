package com.eduexcellence.studentms.exception;

import lombok.Data;

@Data
public class StudentNotFoundException extends RuntimeException {
	String message;
	public StudentNotFoundException(String message) {
		super(message);
	}
}
