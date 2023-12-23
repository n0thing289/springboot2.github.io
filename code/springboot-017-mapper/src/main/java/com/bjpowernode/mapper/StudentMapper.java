package com.bjpowernode.mapper;

import com.bjpowernode.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 老师这里加了 @Mapper注解
 */
@Mapper
public interface StudentMapper {
    List<Student> selectAll();

    Student selectById(Integer id);

    int update(Student student);

    int deleteById(Integer id);

    int insert(Student student);
}
