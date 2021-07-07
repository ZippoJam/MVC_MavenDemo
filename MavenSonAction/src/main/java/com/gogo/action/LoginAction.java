package com.gogo.action;

import com.gogo.po.User;
import com.gogo.service.UserService;
import com.gogo.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * describe
 * 今天不写web.xml文件了，使用注解，在后在框架课程会重点讲注解
 * 作者：曾昭武
 */
@WebServlet("/login006.do")
public class LoginAction  extends HttpServlet {

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



        //2.获取请求参数
        String userName = req.getParameter("userName");
        String pwd = req.getParameter("pwd");

        //3.调用业务代码
        UserService userService  = new UserServiceImpl();
        User user= userService.login(userName,pwd );

        //4.判断user是否登陆成功
        if(user!=null){
            req.getSession().setAttribute("keySbq","值");
            req.getSession().setAttribute("user",user);
            //登陆成功后，需要把值存入session
            req.getRequestDispatcher("/userQuery.do").forward(req,resp);
            // out.println("登陆成功");
        }else {
            //登陆失败再跳转到login.jsp
            resp.sendRedirect("/UserProject005/login.jsp");;
        }

        /*PrintWriter out= resp.getWriter();
        out.println("把结果响映给浏览器");*/

    }


}
