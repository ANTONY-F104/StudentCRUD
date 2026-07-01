package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;

import java.util.List;

public interface IStudentService {
    public Student createStudent(Student student);
    public List<Student> getStudents();
}
