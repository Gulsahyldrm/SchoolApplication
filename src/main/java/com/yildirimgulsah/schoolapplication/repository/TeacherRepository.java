package com.yildirimgulsah.schoolapplication.repository;

import com.yildirimgulsah.schoolapplication.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
