package com.eduexcellence.feesms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduexcellence.feesms.model.FeeDetails;
import com.eduexcellence.feesms.service.FeesService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class FeesController {
	
	@Autowired
	private FeesService feeService;

	@GetMapping(value = "/get/fee/details/{id}")
	public ResponseEntity<List<FeeDetails>> getFeesPaidByStudent(@PathVariable("id") int studentId){
		return feeService.getFeesPaidByStudent(studentId);
	}
	
	@PostMapping(value = "/add/student/fee/details")
	public ResponseEntity<String> addFeeDetailsForStudent(@Valid @RequestBody FeeDetails feeDetails){
		return feeService.addFeeDetailsForStudent(feeDetails);
	}
	
}
