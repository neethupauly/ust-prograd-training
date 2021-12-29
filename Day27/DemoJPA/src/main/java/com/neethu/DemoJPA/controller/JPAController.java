package com.neethu.DemoJPA.controller;

import com.neethu.DemoJPA.entity.Student;
import com.neethu.DemoJPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class JPAController {

    @Autowired
    private StudentService service;

    @RequestMapping("/")
    public String index(){
        Student student1=new Student(1l,"Neethu","MCA",80.6f,24,897655672l);
        service.save(student1);
        return "Student saved";
    }
//    public Student create(HttpServletRequest request){
//        String name=request.getParameter("name");
//        String phone=request.getParameter("phone");
//        Student student=new Student();
//
//    }

    @RequestMapping("/list")
    public List<Student> list(){
        return service.listAll();
    }
}
