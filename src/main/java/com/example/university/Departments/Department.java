package com.example.university.Departments;

import com.example.university.Students.Students;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Department {

    @Id
    @Column(name = "id", nullable = false)
    private Long dept_id;

    private String dept_name;

    @OneToMany(mappedBy = "department_id",cascade = CascadeType.ALL)

    private List<Students> enrolled_students = new ArrayList<>();
}
