package com.bjpowernode.mapper;

import com.bjpowernode.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 第二种方式在著启动类@MapperScan
 */

public interface StudentMapper {
    List<Student> selectAll();

    Student selectById(Integer id);

    int update(Student student);

    int deleteById(Integer id);

    int insert(Student student);
}
