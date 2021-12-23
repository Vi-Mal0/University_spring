package com.example.university.Students;

import com.example.university.Students.StudentProfile.StudentProfile;

import javax.persistence.*;

@Entity
public class Students {

    // variable declaration

    @Id
    @Column(name = "id")
    private Long student_id;

    private  String student_name;

    private Long department_id;

    // getters and setters

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

}