package com.yildirimgulsah.schoolapplication.repository;

import com.yildirimgulsah.schoolapplication.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
