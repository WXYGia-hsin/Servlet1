package com.wang.DAO;

import com.wang.DB.DB;
import com.wang.VO.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/12/30 0030.
 */
public class UserDao {
    private Connection connection;
    public UserDao(){
        connection= DB.getConnection();
    }
    public User login(User user){
        String sql="select * from user where username=? and password=?";
        ResultSet resultSet=null;
      /*  try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                user=new User();
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        try {
            PreparedStatement ps=connection.prepareStatement("sql");
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            resultSet=ps.executeQuery();
            while(resultSet.next()){
                user=new User();
                user.setPassword(resultSet.getString(""));
                user.setPassword(resultSet.getString(""));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
}
}
