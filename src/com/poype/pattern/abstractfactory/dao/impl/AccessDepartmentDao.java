package com.poype.pattern.abstractfactory.dao.impl;

import com.poype.pattern.abstractfactory.dao.DepartmentDao;

public class AccessDepartmentDao implements DepartmentDao {
    @Override
    public void insertDepartment() {
        System.out.println("在Access中insert一条department记录");
    }

    @Override
    public void getDepartment() {
        System.out.println("在Access中查询一条department记录");
    }
}
