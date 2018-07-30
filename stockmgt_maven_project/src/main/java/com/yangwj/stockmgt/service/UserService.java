package com.yangwj.stockmgt.service;

import com.yangwj.stockmgt.model.User;

public interface UserService {
    User selectUserById(Integer userId);  
}