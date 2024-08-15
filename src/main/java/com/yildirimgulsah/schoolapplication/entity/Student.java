package com.yildirimgulsah.schoolapplication.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "classSchoolId")
    private ClassSchool classSchool;
}
