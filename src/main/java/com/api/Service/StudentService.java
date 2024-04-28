package com.api.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.api.Entity.Student;

@Service
public interface StudentService {

	public Student saveStudent( Student student);
	public List<Student> getAllStudent();
	 public void deleteStudent(int id); 
	 public Optional<Student> getStudentbyId(int id);
	 
	 public Optional<Student> updateStudent(int id ,Student studentupdate);
}
