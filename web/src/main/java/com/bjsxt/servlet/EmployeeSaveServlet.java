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
import java.sql.Date;
import java.util.Arrays;

@WebServlet("/EmployeeSaveServlet")
public class EmployeeSaveServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String ename = req.getParameter("ename");
        String pwd = req.getParameter("pwd");
        String sex = req.getParameter("sex");
        String[] hobbies = req.getParameterValues("hobby");
        String hobby = Arrays.toString(hobbies);
        String b = req.getParameter("birth");
        Date birth = Date.valueOf(b);
        String phone = req.getParameter("phone");
        String remark = req.getParameter("remark");
        Employee emp = new Employee(0,  ename,  pwd,  sex,  hobby,  birth,  phone,  remark);

        EmployeeService emps = new EmployeeServiceImpl();
        int insert = emps.insert(emp);

        if(insert < 0){
            req.setAttribute("msg","添加失败");
            req.getRequestDispatcher("/saveUser.jsp").forward(req,resp);
        }else{
            resp.sendRedirect(req.getContextPath()+"/listUser.jsp");
        }
    }
}
