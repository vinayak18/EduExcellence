package com.eduexcellence.feesms.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.eduexcellence.feesms.model.FeeDetails;

import jakarta.validation.Valid;

public interface FeesService {

	public ResponseEntity<List<FeeDetails>> getFeesPaidByStudent(int studentId);

	public ResponseEntity<String> addFeeDetailsForStudent(@Valid FeeDetails feeDetails);

}
