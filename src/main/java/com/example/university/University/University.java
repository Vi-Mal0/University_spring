package com.example.university.University;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {

    @Id
    private Long universty_id;

    private String university_name;


    //getter and setter

    public Long getUniversty_id() {
        return universty_id;
    }

    public void setUniversty_id(Long universty_id) {
        this.universty_id = universty_id;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }
}
