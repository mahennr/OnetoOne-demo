package com.example.onetoonedemo.repository;

import com.example.onetoonedemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {

}