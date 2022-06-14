package com.example.onetoonedemo.service;


import com.example.onetoonedemo.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee createEmployee(Employee emp);

    public Employee updateEmployee(Employee emp);

    public Employee getEmployee(Long empId);

    public void deleteEmployee(Long empId);

    public List<Employee> getAllEmployee();
}
