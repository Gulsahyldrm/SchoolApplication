package com.yildirimgulsah.schoolapplication.controller;

import com.yildirimgulsah.schoolapplication.dto.ClassSchoolDto;
import com.yildirimgulsah.schoolapplication.service.ClassSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("classes")
public class ClassSchoolController {

    @Autowired
    ClassSchoolService service;

    @PostMapping
    public ClassSchoolDto saveProduct(@RequestBody ClassSchoolDto classSchoolDto) {
        return service.save(classSchoolDto);
    }

    @GetMapping("filter/{schoolId}")
    public List<ClassSchoolDto> FindClassBySchoolId(@PathVariable(value = "schoolId")String schoolId){
        return service.findClassesBySchoolId(schoolId);
    }

    @GetMapping("/{id}")
    public ClassSchoolDto find(@PathVariable(value = "id") String id) {
        return service.find(id);
    }


    @GetMapping
    public List<ClassSchoolDto> allClasses(){
        return service.findAll();
    }
}
