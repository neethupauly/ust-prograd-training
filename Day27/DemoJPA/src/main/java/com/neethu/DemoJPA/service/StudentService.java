package com.neethu.DemoJPA.service;

import com.neethu.DemoJPA.entity.Student;
import com.neethu.DemoJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student save(Student student){
        return repository.save(student);
    }

    public List<Student> listAll(){
        return repository.findAll();
    }


}
