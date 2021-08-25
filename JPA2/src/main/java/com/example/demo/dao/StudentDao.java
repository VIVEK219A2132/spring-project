package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Student;

public interface StudentDao extends CrudRepository<Student, Long>{

}
