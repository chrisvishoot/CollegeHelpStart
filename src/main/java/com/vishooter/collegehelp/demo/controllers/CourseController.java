package com.vishooter.collegehelp.demo.controllers;

import com.vishooter.collegehelp.demo.models.Course;
import com.vishooter.collegehelp.demo.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/courses")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Course> getCourses() {
        return courseRepository.findAll();
    }
}
