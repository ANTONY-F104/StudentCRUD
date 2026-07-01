package com.example.studentmanagement.service.Impl;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository repository;

    public Student createStudent(Student student){
        return repository.save(student);
    }
}
