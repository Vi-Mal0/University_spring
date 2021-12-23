package com.example.university.Students.StudentProfile;

import com.example.university.Students.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentProfileService {

    @Autowired
    private StudentProfileRepository studentProfileRepository;

    public String addStudentsProfile(StudentProfile studprof)
    {
        studentProfileRepository.save(studprof);
        return "Student Profile Updated";
    }

    public List<StudentProfile> viewStudentsProfile(){
        return studentProfileRepository.findAll();
    }

    public Optional<StudentProfile> viewStudentsProfileById(Long id){
        return studentProfileRepository.findById(id);
    }


    // create
    public String addStudentProfile(StudentProfile students){
        studentProfileRepository.save(students);
        return "student profile added";
    }

    //  delete
    public String deleteStudentsProfileById(Long id){
        studentProfileRepository.deleteById(id);
        return "data removed";
    }

    public String updateStudentsProfileByID(Long id,StudentProfile studentProfile){
        StudentProfile stud = studentProfileRepository.getById(id);
        if(studentProfile.getAddressLine1() != null){
            stud.setAddressLine1(studentProfile.getAddressLine1());
        }
        if(studentProfile.getAddressLine2() != null){
            stud.setAddressLine2(studentProfile.getAddressLine2());
        }
        if(studentProfile.getCity() != null){
            stud.setCity(studentProfile.getCity());
        }
        if(studentProfile.getCountry() != null){
            stud.setCountry(studentProfile.getCountry());
        }
        if(studentProfile.getGender() != null){
            stud.setGender(studentProfile.getGender());
        }
        if(studentProfile.getPincode() != null){
            stud.setPincode(studentProfile.getPincode());
        }
        if(studentProfile.getState() != null){
            stud.setState(studentProfile.getState());
        }
        if(studentProfile.getPhoneNumber() != null){
            stud.setPhoneNumber(studentProfile.getPhoneNumber());
        }

        studentProfileRepository.save(stud);
        return "updated successfully";
    }


}
