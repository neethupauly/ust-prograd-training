package com.neethu.relations.service;

import com.neethu.relations.entity.Faculty;
import com.neethu.relations.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository repository;
    public List<Faculty> getAllFaculties() {
        return repository.findAll();
    }

    public Faculty save(Faculty faculty){
        return repository.save(faculty);
    }
}
