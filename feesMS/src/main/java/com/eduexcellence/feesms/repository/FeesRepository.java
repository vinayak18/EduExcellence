package com.eduexcellence.feesms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduexcellence.feesms.model.FeeDetails;

@Repository
public interface FeesRepository extends JpaRepository<FeeDetails, Integer>{
	public List<FeeDetails> findByStudentId(int id);
}
