package com.example.studentmanagement.controller;


import java.util.List;

import com.example.studentmanagement.service.IStudentService;
import com.example.studentmanagement.service.Impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;



@RestController
@RequestMapping("/students")
public class StudentController implements IStudentController{


    @Autowired
    private IStudentService studentService;


    // CREATE
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }



}