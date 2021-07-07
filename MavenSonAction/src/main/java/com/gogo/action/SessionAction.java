package com.gogo.action;

import com.gogo.po.User;
import com.gogo.service.UserService;
import com.gogo.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * describe
 * 作者：曾昭武
 */
public class SessionAction extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest reqSBQ, HttpServletResponse respSBQ) throws ServletException, IOException {
        //如果提交方式是get 我也调用doPost方法  如果使用servlet通常就这样写
        doPost(reqSBQ,respSBQ);//调用本类中的方法
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1.处理编码格式
        //处理编码格式，必需在最前面,只要是servlet 大家在最前面加上这两句就OK。
        resp.setContentType("text/html;charset=UTF-8");//响映编码
        //处理请求编码格式
        req.setCharacterEncoding("UTF-8");

        //一般都是在后台写这代码，框架也会
        HttpSession session = req.getSession();
        //存
        session.setAttribute("key","值");
        //取
        session.getAttribute("key");


    }


}
