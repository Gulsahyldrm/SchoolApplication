package com.yildirimgulsah.schoolapplication.entity;

import jakarta.persistence.*;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int teacherId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "classSchoolId")
    private ClassSchool classSchool;
}
