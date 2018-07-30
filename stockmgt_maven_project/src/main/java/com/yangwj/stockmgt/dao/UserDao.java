package com.yangwj.stockmgt.dao;

import com.yangwj.stockmgt.model.User;

public interface UserDao {
    /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);
    
}