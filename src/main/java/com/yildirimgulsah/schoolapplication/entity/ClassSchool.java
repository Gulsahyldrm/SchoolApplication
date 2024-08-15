package com.yildirimgulsah.schoolapplication.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ClassSchool {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int classId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "schoolId")
    private School school;
    @OneToMany(mappedBy = "classSchool", cascade = CascadeType.ALL)
    private List<Student> studentList;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public ClassSchool() {
    }

    public ClassSchool(int classId, String name, School school, List<Student> studentList) {
        this.classId = classId;
        this.name = name;
        this.school = school;
        this.studentList = studentList;
    }
}
