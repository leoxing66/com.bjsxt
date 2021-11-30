package com.bjsxt.service.impl;

import com.bjsxt.entity.Employee;
import com.bjsxt.mapper.EmployeeMapper;
import com.bjsxt.service.EmployeeService;
import com.bjsxt.util.DBUtil;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public Employee login(String ename, String pwd) {
        EmployeeMapper mapper = DBUtil.getSqlSession().getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectOne(ename, pwd);
        DBUtil.closeAll();
        return employee;
    }

    @Override
    public int insert(Employee employee) {
        EmployeeMapper mapper = DBUtil.getSqlSession().getMapper(EmployeeMapper.class);
        int insert = mapper.insert(employee);
        DBUtil.closeAll();
        return insert;
    }

    @Override
    public List<Employee> findAll() {
        EmployeeMapper mapper = DBUtil.getSqlSession().getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.SelectAll();
        DBUtil.closeAll();
        return employees;
    }
}
