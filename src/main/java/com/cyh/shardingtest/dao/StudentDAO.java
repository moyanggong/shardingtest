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
     List<Student> pageQuery(Map queryParam);

     Student query(long id);

    /**
     * 插入
     */
     void insert(Student stu);
    /**
     * 更新
     */
     void update(Student stu);

    /**
     * 删除
     */
     void delete(Student stu);

     List<Student> selectAll();

     List<Student> selectByPage(@Param("offset")int offset,@Param("limit")int limit);
}
