package com.sun.service.impl;

import com.sun.dao.UserDao;
import com.sun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String selectuser(String uname) {
        String password = userDao.selectuser(uname);
        System.out.println(password);
        return "true";
    }
}
