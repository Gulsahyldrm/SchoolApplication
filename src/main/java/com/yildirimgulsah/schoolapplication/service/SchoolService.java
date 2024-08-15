package com.yildirimgulsah.schoolapplication.service;

import com.yildirimgulsah.schoolapplication.dto.ClassSchoolDto;
import com.yildirimgulsah.schoolapplication.dto.SchoolDto;
import com.yildirimgulsah.schoolapplication.entity.ClassSchool;
import com.yildirimgulsah.schoolapplication.entity.Manager;
import com.yildirimgulsah.schoolapplication.entity.School;
import com.yildirimgulsah.schoolapplication.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolRepository repository;
    @Autowired
    ManagerService managerService;
    public School findSchoolById(int schoolId) {
        return repository.findById(schoolId).get();
    }

    private School toEntity(SchoolDto schoolDto) {
        School school = new School();
        school.setName(schoolDto.name);
        return school;
    }

    public SchoolDto fromEntity(School school) {
        SchoolDto dto = new SchoolDto();
        dto.schoolId = school.getSchoolId();
        dto.name = school.getName();
        dto.managerId = school.getManager().getManagerId();
        dto.classSchoolList = school.getClassList();
        return dto;
    }

    private List<SchoolDto> fromEntityList(List<School> schools) {
        List<SchoolDto> schoolDtoList = new ArrayList<>();
        for (School school : schools) {
            schoolDtoList.add(fromEntity(school));
        }
        return schoolDtoList;
    }

    public SchoolDto find(String schoolId) {
        School school = findSchoolById(Integer.parseInt(schoolId));
        return fromEntity(school);
    }

    public List<SchoolDto> findAll() {
        List<School> schools = repository.findAll();

        return fromEntityList(schools);
    }

    public SchoolDto save(SchoolDto schoolDto) {
        School school = toEntity(schoolDto);
        Manager manager = managerService.findManagerById(schoolDto.managerId);
        school.setManagerId(manager);
        return fromEntity(school);
    }
}
