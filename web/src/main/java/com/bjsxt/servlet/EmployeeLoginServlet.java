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

@WebServlet("/EmployeeLoginServlet")
public class EmployeeLoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收web数据
        String ename = req.getParameter("ename");
        String pwd = req.getParameter("pwd");
        //处理数据
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee login = employeeService.login(ename, pwd);
        //响应
        if(login == null){
            req.setAttribute("msg","登录失败");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }else{
            resp.sendRedirect(req.getContextPath()+"/index.html");
        }
    }
}
