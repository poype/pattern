package com.poype.pattern.abstractfactory.dao.impl;

import com.poype.pattern.abstractfactory.dao.UserDao;

/*
 使用sqlServer存储User表
 */
public class SqlServerUserDao implements UserDao {

    @Override
    public void insertUser() {
        System.out.println("在SQLServer中insert一条user记录");
    }

    @Override
    public void getUser() {
        System.out.println("从SQLServer中查询一条user记录");
    }
}
