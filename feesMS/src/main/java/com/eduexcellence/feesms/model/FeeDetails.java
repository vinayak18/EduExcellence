package com.eduexcellence.feesms.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	private String startMonth;
	private String endMonth;
	private int currentYear;
	private Date dateOfPayment;
	private double amount;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id", referencedColumnName = "id")
	private Student student;
	
}
