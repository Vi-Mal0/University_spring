package com.example.university.Students.StudentProfile;

import com.example.university.Gender.Gender;
import com.example.university.Students.Students;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class StudentProfile
{
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

    @OneToOne(mappedBy = "studentProfile")
    @JsonManagedReference
    private Students students;


}