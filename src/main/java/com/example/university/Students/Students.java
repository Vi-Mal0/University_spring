package com.example.university.Students;

import com.example.university.Courses.Courses;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Students {

    // variable declaration

    @Id
    @Column(name = "id")
    private Long student_id;

    private  String student_name;

    private Long department_id;

    @ManyToMany(mappedBy = "students")
    private Set<Courses> courses;
}
