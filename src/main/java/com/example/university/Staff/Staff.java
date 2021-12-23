package com.example.university.Staff;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {

    @Id
    private Long staff_id;

    private String staff_name;

    public Long getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Long staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public Long getStaff_dept_id() {
        return staff_dept_id;
    }

    public void setStaff_dept_id(Long staff_dept_id) {
        this.staff_dept_id = staff_dept_id;
    }

    private Long staff_dept_id;


}
