package com.example.university.Service;


import com.example.university.Entity.Students;
import com.example.university.Repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentsRepository studentsRepository;

    public List<Students> viewStudents(){
        return studentsRepository.findAll();
    }

    public Optional<Students> viewStudentsById(Long id){
        return studentsRepository.findById(id);
    }

    public String addStudent(Students students){
        studentsRepository.save(students);
        return "student added";
    }

}
