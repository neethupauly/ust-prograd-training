package com.neethu.relations.controller;

import com.neethu.relations.entity.Course;
import com.neethu.relations.entity.Faculty;
import com.neethu.relations.entity.Student;
import com.neethu.relations.service.CourseService;
import com.neethu.relations.service.FacultyService;
import com.neethu.relations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @Autowired
    private FacultyService facultyService;

    @Autowired
    private CourseService courseService;

    @GetMapping("/students")
    public List<Student> list() {
        return service.getAllStudents();
    }


     @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable Long id){
        return service.getStudentById(id);
    }



    @GetMapping("/student/new")
    public Student create(HttpServletRequest request) {
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        Student student = new Student(name, age);
        return service.save(student);
    }

    @GetMapping("student/{studentId}/assign-faculty/{facultyId}")
    public Student assignFaculty(@PathVariable Long studentId,@PathVariable Long facultyId){
        Student student=service.getStudentById(studentId);
        Faculty faculty=facultyService.getFacultyById(facultyId);
        student.setFaculty(faculty);
        return service.save(student);
    }

    @GetMapping("student/{studentId}/add-course/{courseId}")
    public Student addCourse(@PathVariable Long studentId,@PathVariable Long courseId){
        Student student=service.getStudentById(studentId);
        Course course=courseService.getCourseById(courseId);
        student.addCourses(course);
        return service.save(student);
    }
}



