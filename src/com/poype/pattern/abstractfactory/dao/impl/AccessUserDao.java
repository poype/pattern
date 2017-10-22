package com.poype.pattern.abstractfactory.dao.impl;

import com.poype.pattern.abstractfactory.dao.UserDao;

public class AccessUserDao implements UserDao {
    @Override
    public void insertUser() {
        System.out.println("在Access中insert一条user记录");
    }

    @Override
    public void getUser() {
        System.out.println("从Access中查询一条user记录");
    }
}
