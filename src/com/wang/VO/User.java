package com.wang.VO;

/**
 * Created by Administrator on 2017/12/30 0030.
 */
public class User {
    private String username;
    private String password;
    public User(){}
   public User(String u, String p){
        this.username=u;
        this.password=p;
    }
    public  String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
