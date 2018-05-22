package com.cyh.shardingtest.service;

import com.cyh.shardingtest.dao.StudentDAO;
import com.cyh.shardingtest.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

    public List<Student> getAllStudent() {
        return studentDAO.selectAll();
    }

    public List<Student> getStudentByPage(int offset, int limit) {
        return studentDAO.selectByPage(offset,limit);
    }
}
