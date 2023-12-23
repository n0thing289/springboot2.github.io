package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.StudentMapper;
import com.bjpowernode.pojo.Student;
import com.bjpowernode.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("studentService")

public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectStudents() {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public Student selectStudentById(Integer id) {
        Student stu = studentMapper.selectById(id);
        return stu;
    }

    @Override
    public boolean updateStudent(Student student) {
        return false;
    }

    @Override
    public boolean deleteStudentById(Integer id) {
        return false;
    }

    @Override
    public boolean addStudent(Student student) {
        return false;
    }
}
