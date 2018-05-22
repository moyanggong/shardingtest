package com.cyh.shardingtest.dao;


import com.cyh.shardingtest.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface StudentDAO {

    /**
     * 分页查找
     */
    public List<Student> pageQuery(Map queryParam);

    public Student query(long id);

    /**
     * 插入
     */
    public void insert(Student stu);
    /**
     * 更新
     */
    public void update(Student stu);

    /**
     * 删除
     */
    public void delete(Student stu);

    public List<Student> selectAll();

    public List<Student> selectByPage(@Param("offset")int offset,@Param("limit")int limit);
}
