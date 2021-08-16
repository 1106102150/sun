package com.sun.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    //用户登录
    public String selectuser(String uname);
}
