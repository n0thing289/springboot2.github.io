package com.bjpowernode.controller;

import com.bjpowernode.pojo.Student;
import com.bjpowernode.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/student/query")
    @ResponseBody
    public Student queryStudent(Integer id){
        Student stu = studentService.selectStudentById(id);
        return stu;
    }
}
