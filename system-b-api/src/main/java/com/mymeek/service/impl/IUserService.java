package com.mymeek.service.impl;

import com.mymeek.pojo.User;
import com.mymeek.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IUserService implements UserService {

    String[] names = {"kim", "marx", "andy", "witt", "max"};

    @Override
    public List<User> queryAll() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            String s = UUID.randomUUID().toString();
            int n = (int) (Math.random() * 5);
            User user = new User(s, names[n], s.substring(s.length() - 6).toUpperCase());
            users.add(user);
        }
        return users;
    }
}
