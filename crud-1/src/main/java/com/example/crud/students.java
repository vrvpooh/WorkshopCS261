package com.example.crud;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="students")
public class students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ; 
	
	@Column(name = "user_name", nullable = false)
	private String userName ; 
	
	@Column(name = "type", nullable = false)
	private String type ; 
	
	@Column(name = "faculty", nullable = false)
	private String faculty ; 
	
	@Column(name = "email", nullable = false)
	private String email ; 
	
	@Column(name = "eng_name", nullable = false)
	private String eng_name ; 
	
}

