package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Employee {
	
	@Id
//	@SequenceGenerator(name = "employeeSequence", sequenceName = "employeeSequence",allocationSize = 1 )
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long Id;
	@NotEmpty (message="The Field is mandatory")
	private String name;
	@Email (message="It is not email")
	@NotEmpty (message="The Field is mandatory")
	private String email;
	@NotEmpty (message="The Field is mandatory")
	private String job_title;
	@NotEmpty (message="The Field is mandatory")
	private String phone;
	@NotEmpty (message="The Field is mandatory")
	private String image_url;
	

}
