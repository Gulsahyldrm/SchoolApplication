package com.yildirimgulsah.schoolapplication.repository;

import com.yildirimgulsah.schoolapplication.entity.ClassSchool;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassRepository extends JpaRepository<ClassSchool, Integer> {
    List<ClassSchool> findAllBySchool_SchoolId(int schoolId);
}
