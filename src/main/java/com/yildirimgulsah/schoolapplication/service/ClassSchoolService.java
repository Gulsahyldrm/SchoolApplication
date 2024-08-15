package com.yildirimgulsah.schoolapplication.service;

import com.yildirimgulsah.schoolapplication.dto.ClassSchoolDto;
import com.yildirimgulsah.schoolapplication.entity.ClassSchool;
import com.yildirimgulsah.schoolapplication.entity.School;
import com.yildirimgulsah.schoolapplication.repository.ClassRepository;
import com.yildirimgulsah.schoolapplication.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassSchoolService {


    @Autowired
    ClassRepository repository;
    @Autowired
    SchoolRepository schoolRepository;
    @Autowired
    SchoolService schoolService;


    private ClassSchool toEntity(ClassSchoolDto classSchoolDto) {
        ClassSchool classSchool = new ClassSchool();
        classSchool.setName(classSchoolDto.name);
        return classSchool;
    }

    public ClassSchoolDto fromEntity(ClassSchool classSchool) {
        ClassSchoolDto dto = new ClassSchoolDto();
        dto.classId = classSchool.getClassId();
        dto.name = classSchool.getName();
        dto.schoolId = classSchool.getSchool().getSchoolId();
        dto.studentList = classSchool.getStudentList();
        return dto;
    }

    private List<ClassSchoolDto> fromEntityList(List<ClassSchool> classes) {
        List<ClassSchoolDto> classSchoolDtoList = new ArrayList<>();
        for (ClassSchool classSchool : classes) {
            classSchoolDtoList.add(fromEntity(classSchool));
        }
        return classSchoolDtoList;
    }

    public ClassSchoolDto find(String classId) {
        ClassSchool category = findClassSchoolById(Integer.parseInt(classId));
        return fromEntity(category);
    }

    public ClassSchool findClassSchoolById(int classId) {
        return repository.findById(classId).get();
    }

    public List<ClassSchoolDto> findAll() {
        List<ClassSchool> classSchools = repository.findAll();

        return fromEntityList(classSchools);
    }

    public ClassSchoolDto save(ClassSchoolDto classSchoolDto) {
        ClassSchool classSchool = toEntity(classSchoolDto);
        School school = schoolService.findSchoolById(classSchoolDto.schoolId);
        classSchool.setSchool(school);
        return fromEntity(classSchool);
    }

    public List<ClassSchoolDto> findClassesBySchoolId(String schoolId){
        return fromEntityList(repository.findAllBySchool_SchoolId(Integer.parseInt(schoolId)));
    }
}
