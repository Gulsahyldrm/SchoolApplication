package com.yildirimgulsah.schoolapplication.repository;

import com.yildirimgulsah.schoolapplication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
