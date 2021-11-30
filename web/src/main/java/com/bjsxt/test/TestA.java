package com.bjsxt.test;

import com.bjsxt.entity.Employee;
import com.bjsxt.service.EmployeeService;
import com.bjsxt.service.impl.EmployeeServiceImpl;
import com.bjsxt.util.DBUtil;

public class TestA {
    public static void main(String[] args) {
        EmployeeService emps = new EmployeeServiceImpl();
        Employee zs = emps.login("zs", "123");
        System.out.println(zs);
    }
}
