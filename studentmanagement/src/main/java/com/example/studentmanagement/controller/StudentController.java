package com.example.studentmanagement.controller;


import java.util.List;

import com.example.studentmanagement.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.studentmanagement.entity.Student;


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



    // READ
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
// update
    @PutMapping("/{id}")
    public Student updatestudent (@PathVariable int id,@RequestBody Student student){
        return studentService.updatestudent(id,student);
    }
//    delete
    @DeleteMapping("/{id}")
public String Deletestudent(@PathVariable int id)
    {
       studentService.Deletestudent(id);
       return "Your record deleted successfully";
    }


}