package com.bjsxt.servlet;

import com.bjsxt.entity.User;
import com.bjsxt.service.UserService;
import com.bjsxt.service.impl.UserServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受前台数据
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        //数据处理链接数据库返回结果
        UserService userService = new UserServiceImpl();
        User login = userService.login(uname, pwd);
        //根据返回结果给用户响应
        if(login == null){
            req.setAttribute("msg","登录失败");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }else{
            resp.sendRedirect(req.getContextPath()+"/success.jsp");
        }
    }
}
