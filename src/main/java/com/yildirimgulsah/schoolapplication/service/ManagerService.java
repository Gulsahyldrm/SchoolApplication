package com.yildirimgulsah.schoolapplication.service;

import com.yildirimgulsah.schoolapplication.entity.Manager;
import com.yildirimgulsah.schoolapplication.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository repository;
    public Manager findManagerById(int managerId) {

        return repository.findById(managerId).get();
    }
}
