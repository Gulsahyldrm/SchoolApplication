package com.yildirimgulsah.schoolapplication.entity;

import jakarta.persistence.*;

@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int managerId;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "schoolId")
    public School schoolId;

    public Manager(int managerId, String name, School schoolId) {
        this.managerId = managerId;
        this.name = name;
        this.schoolId = schoolId;
    }

    public Manager() {
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(School schoolId) {
        this.schoolId = schoolId;
    }
}
