package com.example.studentmanagement.controller;

import com.example.studentmanagement.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IStudentController {
    public Student addStudent(@RequestBody Student student);
    public List<Student> getStudents();
    public Student updatestudent(@PathVariable int id,@RequestBody Student student);
    String Deletestudent(int id);
}
