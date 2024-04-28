package com.api.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.Entity.Student;
import com.api.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}


	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}


	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		 studentRepository.deleteById(id);;
	}


	@Override
	public Optional<Student> getStudentbyId(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}


	@Override
	public Optional<Student> updateStudent(int id ,Student studentupdate) {
		
		Optional<Student> optionalStudent = studentRepository.findById(id);
		
		optionalStudent.ifPresent(student->{
			
			student.setName(studentupdate.getName());
			student.setCity(studentupdate.getCity());
			
			studentRepository.save(student);
			
		});
		
		 return optionalStudent;
	}
	
	

}
