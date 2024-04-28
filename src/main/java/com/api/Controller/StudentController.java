package com.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.Entity.Student;
import com.api.Service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	
	@PostMapping("/add")
	public String saveStudent(Student student)
	{
		
		studentServiceImpl.saveStudent(student); 
		return "Student is Added";
	}

}
