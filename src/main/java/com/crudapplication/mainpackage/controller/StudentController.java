package com.crudapplication.mainpackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapplication.mainpackage.entity.Student;
import com.crudapplication.mainpackage.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired private StudentRepository studentrepo;
	
	@GetMapping("/")
	@ResponseBody
	public String Index() {
		return "This is home page.";
	}
	
	@GetMapping("/getalldata")
	@ResponseBody
	public List<Student> GetAllData() {
		return studentrepo.findAll();
	}
	
	@GetMapping("/getstudentbyid/{id}")
	@ResponseBody
	public Student GetStudentById(@PathVariable int id) {
		try {
			return studentrepo.findById(id).get();
		} catch (Exception e) {
			return new Student();
		}
	}
	
	@GetMapping("/deletestudentbyid/{id}")
	@ResponseBody
	public String DeleteStudentById(@PathVariable int id) {
		try {
			studentrepo.deleteById(id);
			return "Record deleted successfully.";
		} catch (Exception e) {
			return "Invalid student id.";
		}
	}
	
	@GetMapping("/addstudent")
	@ResponseBody
	public String AddStudent() {
		Student stu= new Student();
		stu.setstudentName("Siddhesh Gathibandhe");
		stu.setEmail("siddhesh@yopmail.com");
		studentrepo.save(stu);
		return "Student Data added.";
	}
	
	@GetMapping("/copyname/{name}")
	@ResponseBody
	public String CopyName(@PathVariable String name) {
		return name.equals(null) ? "Nothing is there." : name;
	}
	
}
