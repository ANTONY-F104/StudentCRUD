package com.example.studentmanagement.service.Impl;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository repository;

    public Student createStudent(Student student){

        return repository.save(student);
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }

    public Student updatestudent(int id,Student student)
    {
        Student alreadyexisting = repository.findById(id).get();

        alreadyexisting.setName(student.getName());
        alreadyexisting.setDepartment(student.getDepartment());

        return repository.save(alreadyexisting);

    }
    public void Deletestudent(int id)
    {
        Student del=repository.findById(id).get();
         repository.deleteById(id);

    }
}
