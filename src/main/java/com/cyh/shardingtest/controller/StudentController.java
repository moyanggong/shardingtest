package com.cyh.shardingtest.controller;

import com.cyh.shardingtest.model.Student;
import com.cyh.shardingtest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "student")
    public Student getStudent(@RequestParam long studentId){
         return studentService.getStudentByStudentId(studentId);
    }

}
