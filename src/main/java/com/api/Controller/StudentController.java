package com.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.Entity.Student;
import com.api.Service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/add")
	public String saveStudent(@RequestBody Student student)
	{
		System.out.println("student-->"+student);
		
		studentService.saveStudent(student); 
		return "Student is Added";		
	}
	
	@GetMapping("/get")
	public List<Student> getAllStudent()
	{ 
		return studentService.getAllStudent() ;
	}
}
