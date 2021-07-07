package com.gogo.action;

import com.gogo.po.User;
import com.gogo.service.UserService;
import com.gogo.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * describe
 * 作者：曾昭武
 */
@WebServlet("/findByUserId.do")
public class FindByIdUserAction extends HttpServlet {

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


        //2.获取请求参数
        String idStr = req.getParameter("id");

        Integer id = Integer.parseInt(idStr);

        //3.调用业务代码
        UserService userService = new UserServiceImpl();
        User user =userService.findUserById(id);

        //4.判断是否添加成功，
        if (user!=null) {

            //必需把user 存入 HttpServletRequest
            req.setAttribute("user",user);
            //这里必需通过转发到  updateUser.jsp
            req.getRequestDispatcher("/updateUser.jsp").forward(req, resp);
            // out.println("登陆成功");
        } else {
            //登陆失败再跳转到update.jsp

        }


    }
}