package com.bjsxt.service;

import com.bjsxt.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee login(String ename, String pwd);

    int insert(Employee employee);

    List<Employee> findAll();

}
