package com.api.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@PostMapping("/add/{id}")
	public Optional<Student> updateStudent(@RequestBody Student studentupdate,@PathVariable int id)
	{
		System.out.println("studentupdate-->"+studentupdate);
		
		return studentService.updateStudent(id,studentupdate); 
			
		
	}
	
	@GetMapping("/get")
	public List<Student> getAllStudent()
	{ 
		return studentService.getAllStudent() ;
	}
	
	
	@GetMapping("/get/{id}")
	public Optional<Student> getStudentbyId(@PathVariable int id)
	{ 
		return studentService.getStudentbyId(id) ;
	}
	
	  @DeleteMapping("/delete/{id}")
	    public String deleteStudent(@PathVariable int id) {
	        studentService.deleteStudent(id);
	        return "Student with ID " + id + " is deleted";
	    }
	  
	  
	  
	
}
