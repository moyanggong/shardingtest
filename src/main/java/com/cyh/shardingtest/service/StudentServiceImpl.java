package com.cyh.shardingtest.service;

import com.cyh.shardingtest.dao.StudentDAO;
import com.cyh.shardingtest.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private  StudentDAO studentDAO;


    public Student getStudentByStudentId(long id) {
        return studentDAO.query(id);
    }

    public void addStudent(Student student) {
        studentDAO.insert(student);
    }
}
