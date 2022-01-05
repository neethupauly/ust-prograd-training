package com.neethu.relations.controller;

import com.neethu.relations.entity.Student;
import com.neethu.relations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> list() {
        return service.getAllStudents();
    }

    @GetMapping("/student/new")
    public Student create(HttpServletRequest request) {
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        Student student = new Student(name, age);
        return service.save(student);
    }
}



