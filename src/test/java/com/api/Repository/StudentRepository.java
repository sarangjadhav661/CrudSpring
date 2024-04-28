package com.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
