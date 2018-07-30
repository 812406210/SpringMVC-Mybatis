package com.yangwj.stockmgt.service.impl;

import com.yangwj.stockmgt.dao.UserDao;
import com.yangwj.stockmgt.model.User;
import com.yangwj.stockmgt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service  
public class UserServiceImpl implements UserService {

    @Autowired  
    private UserDao userDao;  

    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
    }  
}