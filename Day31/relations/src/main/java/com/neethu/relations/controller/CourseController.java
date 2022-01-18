package com.neethu.relations.controller;

import com.neethu.relations.entity.Course;
import com.neethu.relations.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> Courses(){
        return  courseService.getAllCourses();
    }

    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable Long id){
        return courseService.getCourseById(id);
    }



    @GetMapping("/course/new")
    public Course create(HttpServletRequest request) {
        String courseName = request.getParameter("name");
        Course course = new Course(courseName);
        return courseService.save(course);
    }


}
