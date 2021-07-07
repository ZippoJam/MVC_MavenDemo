package com.gogo.dao;

import com.gogo.po.User;
import com.gogo.utils.BaseDao;
import com.gogo.utils.PageInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * describe
 * 作者：曾昭武
 */
public class UserDaoImpl implements  UserDao{

    /**
     * 添加
     */
    public int  addUser(User userSbq){
        int i = 0;
        //定义Sql语句
        String sql="INSERT INTO TUSER(t_name,t_password,t_sex,t_date,t_address,t_state) VALUES(?,?,1,NOW(),?,0)";
        //设置参数  ,参数的位置，必需从左到右  有几个问题，必需传几个值
        Object sbqAgrs[]={userSbq.getSbqName(),userSbq.getSbqSassword(),userSbq.getTsbqAddress()};
        i= BaseDao.executeUpdateSbq(sql,sbqAgrs);
        return i;
    }

    /**
     * 删除
     */
    public  int delteUser(int idSbq){
        //DELETE FROM TUSER WHERE t_id=?   idSbq
        String sql="DELETE FROM TUSER WHERE t_id=?";
        Object sbqAgrs[]={idSbq};
        return  BaseDao.executeUpdateSbq(sql,sbqAgrs);
    }
    /**
     * 根据id查询
     * 修改，通常是根据id查询出来数据，再修改的，后面课程还会再讲
     * 这个标准写法
     */
    public  User findUserById(int id) {
        User user =null;
        Connection conn =null;
        PreparedStatement pstm =null;
        ResultSet rs=null;
        try {
            //2.建立连接  Connection
            conn = BaseDao.getConnection();
            //3.处理预编译sql语句
            //请注意，？相当于占位符    t_name=?(这是1个) AND t_password=?（这是第2个）  ?(这是第3个)
            pstm = conn.prepareStatement("SELECT * FROM tuser where t_id=? ");
            pstm.setObject(1,id);
            //5.执行预编译sql语句
            rs = pstm.executeQuery();
            //6.循环遍历
            while (rs.next()){
                //注意，这需必需new对象
                user = new User();
                user.setSbqId(rs.getInt(1));
                user.setSbqName(rs.getString(2));
                user.setSbqSassword(rs.getString("t_password"));
                //很多同学这里忘记了  ,必需把对象添加到集合中
                // list.add(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //释放资源,不管有没有错，都执行。
            BaseDao.closeAll(conn,pstm,rs);
        }



        return user;
    }
    /**
     * 修改
     */
    public int  updateUser(User userSbq){
        int i = 0;
        Connection conn =null;
        PreparedStatement pstm =null;
        try {
            //2.建立连接  Connection
            conn = BaseDao.getConnection();
            System.out.println(conn);
            //3.处理预编译sql语句
            //请注意，？相当于占位符    t_name=?(这是1个) AND t_password=?（这是第2个）  ?(这是第3个)
            pstm = conn.prepareStatement("UPDATE TUSER  SET t_name=?,t_sex=? WHERE t_id=?");
            //4.给点位符赋值，我有1个问号?必需给1个问号赋值
            pstm.setObject(1,userSbq.getSbqName());
            pstm.setObject(2,userSbq.getTsbqSex());
            pstm.setObject(3,userSbq.getSbqId());
            //5.执行预编译sql语句executeUpdate(注意这里没有sql语句 ) DML使用
            i =pstm.executeUpdate();
            System.out.println("修改成功");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(conn,pstm,null);
        }


        return i;
    }
    /**
     * 查询
     */
    public List<User> queryAll(User user1){
        //1.创建集合对象
        List<User> list = new ArrayList<User>();
        Connection conn = BaseDao.getConnection();
        System.out.println(conn);
        PreparedStatement pstm = null;
        ResultSet rs=null;
        try{
            //3.处理预编译sql语句
            //请注意，？相当于占位符    t_name=?(这是1个) AND t_password=?（这是第2个）  ?(这是第3个)
           pstm = conn.prepareStatement("SELECT * FROM tuser ");

            //没有？号就不需给？点位符赋值
            //5.执行预编译sql语句
             rs = pstm.executeQuery();
            //6.循环遍历
            while (rs.next()){
                //注意，这需必需new对象
                User user = new User();
                user.setSbqId(rs.getInt(1));
                user.setSbqName(rs.getString(2));
                user.setSbqSassword(rs.getString("t_password"));
                //很多同学这里忘记了  ,必需把对象添加到集合中
                list.add(user);
            }
        }catch (Exception e){


        }finally {
            BaseDao.closeAll(conn,pstm,rs);
        }
        return list;
    }

    /**
     * 登陆
     */
    public User login(String userName ,String pwd){
        User user =null;
        Connection conn =null;
        PreparedStatement pstm =null;
        ResultSet rs=null;
        try {
            //2.建立连接  Connection
            conn = BaseDao.getConnection();
            //3.处理预编译sql语句
            //请注意，？相当于占位符    t_name=?(这是1个) AND t_password=?（这是第2个）  ?(这是第3个)
            pstm = conn.prepareStatement("SELECT * FROM tuser WHERE t_name=? AND t_password=? ");
            pstm.setObject(1,userName);
            pstm.setObject(2,pwd);
            //5.执行预编译sql语句
            rs = pstm.executeQuery();
            //6.循环遍历
            while (rs.next()){
                //注意，这需必需new对象
                user = new User();
                user.setSbqId(rs.getInt(1));
                user.setSbqName(rs.getString(2));
                user.setSbqSassword(rs.getString("t_password"));
                //很多同学这里忘记了  ,必需把对象添加到集合中
                // list.add(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //释放资源,不管有没有错，都执行。
            BaseDao.closeAll(conn,pstm,rs);
        }

        return user;
    }
    public  List<User> queryAllPage(PageInfo page, User user1){
        List<User> list = new ArrayList<User>();
        Connection conn = BaseDao.getConnection();
        System.out.println(conn);
        PreparedStatement pstm = null;
        ResultSet rs=null;
        try{
            //3.处理预编译sql语句
            //请注意，？相当于占位符    t_name=?(这是1个) AND t_password=?（这是第2个）  ?(这是第3个)
            pstm = conn.prepareStatement("SELECT * FROM tuser LIMIT ?,? ");

            //SELECT * FROM emp LIMIT (pageNo-1)*pageSize,pageSize;
            int begin = (page.getCurPageNo()-1)*page.getPageSize();
            int end=page.getPageSize();

            pstm.setObject(1,begin);
            pstm.setObject(2,end);

            //没有？号就不需给？点位符赋值
            //5.执行预编译sql语句
            rs = pstm.executeQuery();
            //6.循环遍历
            while (rs.next()){
                //注意，这需必需new对象
                User user = new User();
                user.setSbqId(rs.getInt(1));
                user.setSbqName(rs.getString(2));
                user.setSbqSassword(rs.getString("t_password"));
                //很多同学这里忘记了  ,必需把对象添加到集合中
                list.add(user);
            }
        }catch (Exception e){


        }finally {
            BaseDao.closeAll(conn,pstm,rs);
        }
        return  list;
    }

    /**
     * 查询总条数
     */
    public  int getTotalCount(User user){
        int i=0;
        Connection conn = BaseDao.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs=null;
        try{
            //3.处理预编译sql语句
            //请注意，？相当于占位符    t_name=?(这是1个) AND t_password=?（这是第2个）  ?(这是第3个)
            pstm = conn.prepareStatement("SELECT  count(*) FROM tuser ");
            //没有？号就不需给？点位符赋值
            //5.执行预编译sql语句
            rs = pstm.executeQuery();
            //6.循环遍历
            while (rs.next()){
                i=rs.getInt(1);
            }
        }catch (Exception e){
          e.printStackTrace();
        }finally {
            BaseDao.closeAll(conn,pstm,rs);
        }

        return  i;


    }
}
