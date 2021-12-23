package com.example.university.Students;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentsRepository studentsRepository;

    // view
    public List<Students> viewStudents(){
        return studentsRepository.findAll();
    }

    public Optional<Students> viewStudentsById(Long id){
        return studentsRepository.findById(id);
    }

    // create
    public String addStudent(Students students){
        studentsRepository.save(students);
        return "student added";
    }

    //  delete
    public String deleteStudentsById(Long id){
        studentsRepository.deleteById(id);
        return "data removed";
    }

    public String deleteStudents(Students students){
        studentsRepository.delete(students);
        return "data removed";
    }

    //  update
    public String updateStudentsByID(Long id,Students students){
        Students stud = studentsRepository.getById(id);
        if(students.getStudent_name() != null){
            stud.setStudent_name(students.getStudent_name());
        }
        if(students.getDepartment_id() != null){
            stud.setDepartment_id(students.getDepartment_id());
        }
        studentsRepository.save(stud);
        return "updated successfully";
    }
}
