package com.api.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.Entity.Student;

@Service
public interface StudentService {

	public Student saveStudent(Student student);
	public List<Student> getAllStudent();
}
