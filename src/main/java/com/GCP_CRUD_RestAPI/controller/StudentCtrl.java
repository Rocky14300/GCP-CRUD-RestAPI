package com.GCP_CRUD_RestAPI.controller;

import com.GCP_CRUD_RestAPI.model.Student;
import com.GCP_CRUD_RestAPI.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class StudentCtrl {

    @Autowired
    StudentRepo repo;

    @GetMapping("greet/{name}")
    private String greet(@PathVariable String name){

        Student std = new Student(
                UUID.randomUUID().toString(),name
        );

        repo.save(std);
        return "Hello "+name;

    }
}
