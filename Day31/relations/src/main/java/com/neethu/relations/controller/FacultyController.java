package com.neethu.relations.controller;


import com.neethu.relations.entity.Faculty;
import com.neethu.relations.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class FacultyController {
    @Autowired
    private FacultyService service;

    @GetMapping("/faculties")
    public List<Faculty> list(){
        return service.getAllFaculties();
    }

    @GetMapping("/faculty/{id}")
    public Faculty getFaculty(@PathVariable Long id){
        return service.getFacultyById(id);
    }

    @GetMapping("/faculty/new")
    public Faculty create(HttpServletRequest request){
        String name=request.getParameter("name");
        Faculty faculty=new Faculty(name);
        return service.save(faculty);
    }
}


