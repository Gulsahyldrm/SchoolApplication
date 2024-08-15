package com.yildirimgulsah.schoolapplication.dto;

import com.yildirimgulsah.schoolapplication.entity.ClassSchool;

import java.util.List;

public class SchoolDto {
    public int schoolId;
    public String name;
    public List<ClassSchool> classSchoolList;
    public int managerId;
}
