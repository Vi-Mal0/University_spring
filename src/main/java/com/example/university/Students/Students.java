package com.example.university.Students;

import com.example.university.Courses.Courses;
import com.example.university.Departments.Department;
import com.example.university.Students.StudentProfile.StudentProfile;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Students {

    @Id
    private Long student_id;

    private  String student_name;

    private String department_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id",updatable = false,insertable = false)
    @JsonBackReference
    private Department department;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    @JsonBackReference
    private StudentProfile studentProfile;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "stu_crs",joinColumns={@JoinColumn(name="student_id")},
            inverseJoinColumns={@JoinColumn(name="course_id")})
    @JsonIgnore
    private Set<Courses> courses;

}
