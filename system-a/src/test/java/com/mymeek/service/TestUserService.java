package com.mymeek.service;

import com.mymeek.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestUserService {

    private UserService userService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:dubbo/*.xml");
        this.userService = applicationContext.getBean(UserService.class);
    }

    @Test
    public void testQueryAll() {
        System.out.println("\n");
        List<User> users = this.userService.queryAll();
        for (User user: users) {
            System.out.println(user);
        }
        System.out.println("\n");
    }
}
