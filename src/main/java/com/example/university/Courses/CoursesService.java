package com.example.university.Courses;

import com.example.university.Departments.Department;
import com.example.university.Students.StudentProfile.StudentProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {

    @Autowired
    private CoursesRepository coursesRepository;

    public List<Courses> viewCourse(){
        return coursesRepository.findAll();
    }

    public String addcourset(Courses courses){
        coursesRepository.save(courses);
        return "course added ";
    }

}
