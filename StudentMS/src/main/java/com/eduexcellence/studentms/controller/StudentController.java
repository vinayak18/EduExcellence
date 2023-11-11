package com.eduexcellence.studentms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.eduexcellence.studentms.model.FeeDetails;
import com.eduexcellence.studentms.model.Student;
import com.eduexcellence.studentms.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

	@Autowired
	WebClient.Builder webClientBuilder;
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value="/student/get/all")
	public ResponseEntity<List<Student>> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@GetMapping(value="/student/get/id/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int id){
		return studentService.getStudentById(id);
	}
	
	@PutMapping(value="/student/update/details")
	public ResponseEntity<String> updateStudentDetails(@Valid @RequestBody Student student){
		return studentService.updateStudentDetails(student);
	}
	
	@DeleteMapping(value="/student/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") int id){
		return studentService.deleteStudent(id);
	}
	
	@PostMapping(value="/student/add/new")
	public ResponseEntity<String> addNewStudent(@Valid @RequestBody Student student){
		return studentService.addNewStudent(student);
	}
	
	@GetMapping(value = "/student/get/fee/details/{id}")
	public ResponseEntity<List<FeeDetails>> getFeesPaidByStudent(@PathVariable("id") int studentId){
		return ResponseEntity.ok(webClientBuilder.build().get().uri("http://localhost:8091/api/v1/fee/get/details/"+studentId).retrieve().bodyToMono(List.class).block());
	}
}
