package com.bjpowernode.service;

import com.bjpowernode.pojo.Student;

import java.util.List;

public interface StudentService {

    List<Student> selectStudents();

    Student selectStudentById(Integer id);

    boolean updateStudent(Student student);

    boolean deleteStudentById(Integer id);

    boolean addStudent(Student student);
}
