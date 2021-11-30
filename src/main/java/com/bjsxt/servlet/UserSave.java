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

@WebServlet(urlPatterns = "/UserSave")
public class UserSave extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获得web数据
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        User user = new User();
        user.setUname(uname);
        user.setPwd(pwd);
        //业务处理数据返回int
        UserService userService = new UserServiceImpl();
        int save = userService.save(user);
        //反馈web
        if(save <= 0){
            req.setAttribute("msg","注册失败");
            req.getRequestDispatcher(req.getContextPath()+"/save.jsp");
        }else{
            resp.sendRedirect(req.getContextPath()+"/login.jsp");
        }
    }


}
