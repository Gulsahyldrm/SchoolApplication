package com.yildirimgulsah.schoolapplication.repository;

import com.yildirimgulsah.schoolapplication.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {
}
