package com.eduexcellence.feesms.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int rollNo;
	@NotNull(message = "First Name must not be null")
	private String firstName;
	@NotNull(message = "Last Name must not be null")
	private String lastName;
	@NotNull(message = "Address must not be null")
	private String address;
	@NotNull(message = "Phone No must not be null")
	private String phoneNo;
	@NotNull(message = "Grade must not be null")
	@Min(value = 1, message = "Grade must be between 1-12")
	@Max(value = 12, message = "Grade must be between 1-12")
	private int grade;
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	private FeeDetails fee;
}
