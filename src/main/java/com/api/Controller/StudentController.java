package com.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/get")
	public List<Student> getAllStudent(Student student)
	{ 
		return studentServiceImpl.getAllStudent() ;
	}
}
