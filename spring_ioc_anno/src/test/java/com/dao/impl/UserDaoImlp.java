package com.dao.impl;

import com.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//<bean id="userDao" class="com.dao.impl.UserDaoImlp"></bean>
//@Component("userDao")
@Repository("userDao")
public class UserDaoImlp implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDao running..");
    }
}
