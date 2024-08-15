package com.yildirimgulsah.schoolapplication.dto;

import com.yildirimgulsah.schoolapplication.entity.ClassSchool;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class StudentDto {
    private int studentId;
    private String name;
    private ClassSchoolDto classId;
}
