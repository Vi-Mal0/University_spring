package com.example.university.Students.StudentProfile;

import com.example.university.Gender.Gender;
import com.example.university.Students.Students;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class StudentProfile
{

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    @OneToOne
    @PrimaryKeyJoinColumn
    @JoinColumn(name = "student_id",referencedColumnName = "id")
    private Students students;




    @Id
    private Long stpf_id;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String addressLine1;
    private String addressLine2;

    private String city;
    private String state;
    private String pincode;
    private String country;

}