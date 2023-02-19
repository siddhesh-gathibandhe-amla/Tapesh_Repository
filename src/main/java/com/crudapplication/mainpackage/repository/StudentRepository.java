package com.crudapplication.mainpackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapplication.mainpackage.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
