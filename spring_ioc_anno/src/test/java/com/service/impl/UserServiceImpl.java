package com.service.impl;

import com.dao.UserDao;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
// <bean id="userService" class="com.service.impl.UserServiceImpl">
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {
@Value("${jdbc.driver}")
private String driver;
//  <property name="userDao" ref="userDao"></property>
//    @Autowired//按照数据类型从Spring容器中进行匹配的
//    @Qualifier("userDao")//是按照id值从容器中进行匹配的 但是主要此处@Qualifier结合@Autowired一起使用
    @Resource(name = "userDao")
    private UserDao userDao;
   //set方法 XML配置需写 注解配置可不写

    @Override
    public void save() {
        userDao.save();
        System.out.println(driver);
    }

}
