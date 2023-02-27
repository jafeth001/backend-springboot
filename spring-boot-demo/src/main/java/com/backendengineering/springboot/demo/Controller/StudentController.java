package com.backendengineering.springboot.demo.Controller;

import com.backendengineering.springboot.demo.Entity.Student;
import com.backendengineering.springboot.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/std")
    public Student savestudent(@RequestBody Student student){
      return   studentService.savestudent(student);
    }
    @GetMapping("/std")
    public List<Student> fetchStudent(){
        return studentService.fetchStudent();
    }
    @GetMapping("/std/{id}")
    public Student fetchstudentbyid(@PathVariable ("id") Long stdid){
        return studentService.fetchstudentbyid(stdid);
    }
    @DeleteMapping("/std/{id}")
        public String deletestd (@PathVariable ("id") Long stdid){

         studentService.deletestd(stdid);
         return "Student Deleted Successfully!!!";
    }
}
