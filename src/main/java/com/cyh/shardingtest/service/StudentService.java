package com.cyh.shardingtest.service;

import com.cyh.shardingtest.model.Student;

import java.util.List;

public interface StudentService {

    Student getStudentByStudentId(long id);

    void addStudent(Student student);

    List<Student> getAllStudent();

    List<Student> getStudentByPage(int offset,int limit);


}
