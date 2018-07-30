package com.yangwj.stockmgt.test.service;

import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;
import com.yangwj.stockmgt.model.User;
import com.yangwj.stockmgt.service.UserService;
import com.yangwj.stockmgt.test.SpringTestCase;  

public class UserServiceTest extends SpringTestCase {

    @Autowired  
    private UserService userService; 

    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(3);  
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }  
}