package com.example.university.Courses;

import com.example.university.Students.Students;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Courses {

    @Id
    private Long Id;

    private String course_name;

    private String course_description;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private Set<Students> students;



}
