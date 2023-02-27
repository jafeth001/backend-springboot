package com.backendengineering.springboot.demo.Service;

import com.backendengineering.springboot.demo.Entity.Student;
import com.backendengineering.springboot.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student savestudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> fetchStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student fetchstudentbyid(Long stdid) {
        return studentRepository.findById(stdid).get();
    }

    @Override
    public void deletestd(Long stdid) {
        studentRepository.deleteById(stdid);
    }
}
