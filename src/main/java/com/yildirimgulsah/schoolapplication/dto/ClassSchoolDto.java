package com.yildirimgulsah.schoolapplication.dto;

import com.yildirimgulsah.schoolapplication.entity.Student;

import java.util.List;

public class ClassSchoolDto {
    public int classId;
    public String name;
    public int schoolId;
    public List<Student> studentList;
}
