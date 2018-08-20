
package com.wang.Control;

import com.wang.DAO.UserDao;
import com.wang.VO.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/12/19 0019.
 */
//@WebServlet(name = "UserControl",urlPatterns = {"/user"} )
public class UserControl extends HttpServlet {
    public UserControl(){}
    UserDao userDao=new UserDao();
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
       String username=request.getParameter("username");
       String password=request.getParameter("password");
        User user=new User(username,password);
        if(userDao.login(user)!=null){
            request.setAttribute("msg","登录成功");
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(request,response);

        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }

}

