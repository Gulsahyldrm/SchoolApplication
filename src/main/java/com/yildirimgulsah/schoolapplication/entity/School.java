package com.yildirimgulsah.schoolapplication.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int schoolId;
    private String name;
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<ClassSchool> classSchoolList;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "managerId")
    public Manager managerId;

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ClassSchool> getClassList() {
        return classSchoolList;
    }

    public void setClassList(List<ClassSchool> classSchoolList) {
        this.classSchoolList = classSchoolList;
    }

    public Manager getManager() {
        return managerId;
    }

    public void setManagerId(Manager managerId) {
        this.managerId = managerId;
    }

    public School(int schoolId, String name, List<ClassSchool> classSchoolList, Manager managerId) {
        this.schoolId = schoolId;
        this.name = name;
        this.classSchoolList = classSchoolList;
        this.managerId = managerId;
    }

    public School() {
    }


}
