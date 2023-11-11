package com.eduexcellence.studentms.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.eduexcellence.studentms.model.Student;

import jakarta.validation.Valid;

public interface StudentService {

	public ResponseEntity<List<Student>> getAllStudent();

	public ResponseEntity<String> addNewStudent(Student student);

	public ResponseEntity<Student> getStudentById(int id);

	public ResponseEntity<String> updateStudentDetails(@Valid Student student);

	public ResponseEntity<String> deleteStudent(int id);

}
