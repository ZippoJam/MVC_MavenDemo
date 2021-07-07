package com.gogo.action.day10;

import com.gogo.po.User;
import com.gogo.service.UserService;
import com.gogo.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * describe
 * 作者：曾昭武
 */
@WebServlet("/findUserByName")
public class FindUserByNameAction extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest reqSBQ, HttpServletResponse respSBQ) throws ServletException, IOException {
        //如果提交方式是get 我也调用doPost方法  如果使用servlet通常就这样写
        doPost(reqSBQ, respSBQ);//调用本类中的方法
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1.处理编码格式
        //处理编码格式，必需在最前面,只要是servlet 大家在最前面加上这两句就OK。
        resp.setContentType("text/html;charset=UTF-8");//响映编码
        //处理请求编码格式
        req.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();

        //2.获取请求参数
        String userName = req.getParameter("userName");

        //3.需要调用业务层代码
        UserService userService = new UserServiceImpl();

        //这个调用业务层代码作业，大家自己完成
       // boolean b userService.findUserByName(userName);
        boolean b=false;//假装有值

        if(b){
            out.println("1");
        }else {
            out.println("0");
        }

    }
}