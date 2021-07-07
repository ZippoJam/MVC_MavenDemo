package com.gogo.service;

import com.gogo.po.User;
import com.gogo.utils.PageInfo;

import java.util.List;

/**
 * describe  业务层接口
 * 作者：曾昭武
 */
public interface UserService {
    /**
     * 添加
     */
    public int  addUser(User userSbq);
    /**
     * 删除
     */
    public  int delteUser(int idSbq);

    /**
     * 根据id查询
     * 修改，通常是根据id查询出来数据，再修改的，后面课程还会再讲
     */
    public  User findUserById(int id);

    /**
     * 修改
     */
    public int  updateUser(User userSbq);

    /**
     * 查询
     */
    public List<User> queryAll(User user);
    /**
     * 登陆
     */
    public User login(String userName, String pwd);

    /**
     * 分页查询
     * @return
     */
    //public  List<User> queryAllPage(int curPageNo,int pageSize,User user);
    public  List<User> queryAllPage(PageInfo pageInfo, User user);

    /**
     * 查询总条数
     */
    public  int getTotalCount(User user);
}
