package com.crudapplication.mainpackage.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@JsonIgnoreProperties("hibernateLazyInitializer")
@Table(name = "StudentTable")
@Entity
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "StudentId")
	private int StudentId;
	
	@Column(name = "StudentName")
	private String StudentName;
	

	@Column(name = "Email")
	private String Email;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int StudentId, String StudentName, String Email) {
		super();
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.Email = Email;
	}

	public Integer getStudentId() {
		return StudentId;
	}

	public void setStudentId(Integer StudentId) {
		this.StudentId = StudentId;
	}

	public String getstudentName() {
		return StudentName;
	}

	public void setstudentName(String StudentName) {
		this.StudentName = StudentName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}

	
