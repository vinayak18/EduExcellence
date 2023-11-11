package com.eduexcellence.studentms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eduexcellence.studentms.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	public List<Student> findByGrade(int grade);
}
