package com.bjsxt.mapper;

import com.bjsxt.entity.Employee;

import java.util.List;

public interface EmployeeMapper {

    Employee selectOne(String ename, String pwd);

    int insert(Employee employee);

    List<Employee> SelectAll();
}
