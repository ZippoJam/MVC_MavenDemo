package com.gogo.service;
import com.gogo.dao.UserDao;
import com.gogo.dao.UserDaoImpl;
import com.gogo.po.User;
import com.gogo.utils.PageInfo;

import java.util.List;

/**
 * describe  业务层 实现类
 * 业务层  调用dao层
 * 作者：曾昭武
 */
public class UserServiceImpl implements  UserService{

    //业务层  调用dao层  创建Dao层对象  接口  变量名  = new 实现类();
    private UserDao userDao = new UserDaoImpl();
    /**
     * 添加
     */
    public int  addUser(User userSbq2){
        int i = 0;
        //调用dao层方法
        i = userDao.addUser(userSbq2);

        //在实际开发，这里会有业务逻辑代码，
        return i;
    }
    /**
     * 删除
     */
    public  int delteUser(int idSbq){
        return userDao.delteUser(idSbq);
    }
    /**
     * 根据id查询
     * 修改，通常是根据id查询出来数据，再修改的，后面课程还会再讲
     */
    public  User findUserById(int id){
        return userDao.findUserById(id);
    }
    /**
     * 修改
     */
    public int  updateUser(User userSbq){
        return userDao.updateUser(userSbq);
    }
    /**
     * 查询
     */
    public List<User> queryAll(User user){
        return userDao.queryAll(user);
    }

    /**
     * 登陆
     */
    public User login(String userName , String pwd){
        return  userDao.login(userName,pwd);
    }
    /**
     * 分页查询
     * 请各位同学写完了一定测试下，我就不测试了
     * @return
     */
    //public  List<User> queryAllPage(int curPageNo,int pageSize,User user);
    public  List<User> queryAllPage(PageInfo pageInfo, User user){
        return userDao.queryAllPage(pageInfo,user);
    }

    /**
     * 查询总条数
     */
    public  int getTotalCount(User user){
        return  userDao.getTotalCount(user);
    }
}
