package com.dao.impl;

import com.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("save running....UserDaoImpl");
    }
}
