package com.bjsxt.servlet;

import com.bjsxt.entity.Employee;
import com.bjsxt.service.EmployeeService;
import com.bjsxt.service.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/EmployeeFindAllServlet")
public class EmployeeFindAllServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        EmployeeService emps = new EmployeeServiceImpl();
        List<Employee> all = emps.findAll();

        req.setAttribute("list",all);
        req.getRequestDispatcher("/listUser.jsp").forward(req,resp);
    }
}
