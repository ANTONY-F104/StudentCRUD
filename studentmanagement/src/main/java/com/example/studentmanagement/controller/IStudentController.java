package com.example.studentmanagement.controller;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IStudentController {
    public Student addStudent(@RequestBody Student student);
    public List<Student> getStudents();
}
