package com.wang.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/12/30 0030.
 */
public class DB {
    private static Connection connection;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/user?characterEncoding=utf-8","root","root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static Connection closeConection(){
        if(connection!=null){
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
