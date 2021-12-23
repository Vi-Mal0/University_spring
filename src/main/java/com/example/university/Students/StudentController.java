package com.example.university.Students;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("viewStudents")
    public List<Students> viewStud(){
        return studentService.viewStudents();
    }

    @GetMapping("viewStudents/{id}")
    public Optional<Students> viewStudById(@PathVariable("id")Long student_id){
        return studentService.viewStudentsById(student_id);
    }

    @PostMapping("addStudents")
    public String addStud(@RequestBody Students students){
        return studentService.addStudent(students);
    }

    @DeleteMapping("deleteStudents/{id}")
    public String delStudById(@PathVariable("id") Long stud_id){
        return studentService.deleteStudentsById(stud_id);
    }

    @PatchMapping("updateStudents/{id}")
    public String updateStud(@PathVariable("id")Long stud_id,@RequestBody Students students){
        return studentService.updateStudentsByID(stud_id,students);
    }
}
