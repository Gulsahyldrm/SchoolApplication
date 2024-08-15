package com.yildirimgulsah.schoolapplication.controller;

import com.yildirimgulsah.schoolapplication.dto.ClassSchoolDto;
import com.yildirimgulsah.schoolapplication.dto.SchoolDto;
import com.yildirimgulsah.schoolapplication.service.ClassSchoolService;
import com.yildirimgulsah.schoolapplication.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("schools")
public class SchoolController {

    @Autowired
    SchoolService service;

    @PostMapping
    public SchoolDto saveProduct(@RequestBody SchoolDto schoolDto) {
        return service.save(schoolDto);
    }

    @GetMapping("/{id}")
    public SchoolDto find(@PathVariable(value = "id") String id) {
        return service.find(id);
    }


    @GetMapping
    public List<SchoolDto> allClasses(){
        return service.findAll();
    }
}
