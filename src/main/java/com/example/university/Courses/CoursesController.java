package com.example.university.Courses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursesController {
    @Autowired
    private CoursesService coursesService;

    @GetMapping("viewCourses")
    public List<Courses> getCourse(){
        return coursesService.viewCourse();
    }

    @PostMapping("addCourse")
    public String addCourse(@RequestBody Courses courses){
        return coursesService.addcourset(courses);
    }
}
