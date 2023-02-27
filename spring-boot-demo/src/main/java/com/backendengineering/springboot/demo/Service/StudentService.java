package com.backendengineering.springboot.demo.Service;

import com.backendengineering.springboot.demo.Entity.Student;

import java.util.List;

public interface StudentService {

 public  Student savestudent(Student student);

public List<Student> fetchStudent();

 public Student fetchstudentbyid(Long stdid);

 public void deletestd(Long stdid);
}
