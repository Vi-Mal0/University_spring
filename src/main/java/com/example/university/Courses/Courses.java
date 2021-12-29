package com.example.university.Courses;

import com.example.university.Students.Students;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Courses {

    @Id
    private Long course_id;

    private String course_name;

    private String course_description;

    @ManyToMany(mappedBy = "courses")
    private Set<Students> students;


}
