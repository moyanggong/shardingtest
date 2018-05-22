package com.cyh.shardingtest.controller;

import com.cyh.shardingtest.model.Student;
import com.cyh.shardingtest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "id")
    public Student getStudent(@RequestParam long studentId){
         return studentService.getStudentByStudentId(studentId);
    }

    @PostMapping(value = "add")
    public void add(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping(value = "all")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping(value = "page")
    public List<Student> getStudentByPage(@RequestParam("offset")int offset,@RequestParam("limit")int limit){
        return studentService.getStudentByPage(offset,limit);
    }


}
