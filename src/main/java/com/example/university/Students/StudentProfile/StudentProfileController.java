package com.example.university.Students.StudentProfile;

import com.example.university.Students.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentProfileController {

    @Autowired
    private StudentProfileService studentProfileService;

    @GetMapping("viewStudentProfile")
    public List<StudentProfile> viewStudpf(){
        return studentProfileService.viewStudentsProfile();
    }

    @GetMapping("viewStudentsProfile/{id}")
    public Optional<StudentProfile> viewStudById(@PathVariable("id")Long student_id){
        return studentProfileService.viewStudentsProfileById(student_id);
    }

    @PostMapping("addStudentsProfile")
    public String addStudpf(@RequestBody StudentProfile studentProfile){
        return studentProfileService.addStudentProfile(studentProfile);
    }

    @DeleteMapping("deleteStudentsProfile/{id}")
    public String delStudpfById(@PathVariable("id") Long stud_id){
        return studentProfileService.deleteStudentsProfileById(stud_id);
    }

    @PatchMapping("updateStudentsProfile/{id}")
    public String updateStudpf(@PathVariable("id")Long stud_id,@RequestBody StudentProfile studentProfile){
        return studentProfileService.updateStudentsProfileByID(stud_id,studentProfile);
    }

}
