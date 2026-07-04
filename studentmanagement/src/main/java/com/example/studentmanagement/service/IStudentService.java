package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IStudentService {
     Student createStudent(Student student);
     List<Student> getStudents();
     Student updatestudent(@PathVariable int id, @RequestBody Student student);
     void Deletestudent(@PathVariable int id);

}
