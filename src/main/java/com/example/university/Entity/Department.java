package com.example.university.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {

    //variables declaration
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long dept_id;

    private String dept_name;

    @OneToMany(mappedBy = "department_id",cascade = CascadeType.ALL)
    private List<Students> enrolled_students = new ArrayList<>();

    // getter and setters

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }


    public Long getDept_id() {
        return dept_id;
    }

    public void setDept_id(Long id) {
        this.dept_id = id;
    }

    public List<Students> getEnrolled_students() {
        return enrolled_students;
    }

    public void setEnrolled_students(List<Students> enrolled_students) {
        this.enrolled_students = enrolled_students;
    }
}
