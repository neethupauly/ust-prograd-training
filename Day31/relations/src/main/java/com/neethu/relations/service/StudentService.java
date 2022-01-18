package com.neethu.relations.service;

import com.neethu.relations.entity.Student;
import com.neethu.relations.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student save(Student student) {
        return repository.save(student);
    }

    public Student getStudentById(Long studentId) {
        return repository.findById(studentId).get();
    }
}
