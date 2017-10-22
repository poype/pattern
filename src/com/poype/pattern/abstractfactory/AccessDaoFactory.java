package com.poype.pattern.abstractfactory;

import com.poype.pattern.abstractfactory.dao.DepartmentDao;
import com.poype.pattern.abstractfactory.dao.UserDao;
import com.poype.pattern.abstractfactory.dao.impl.AccessDepartmentDao;
import com.poype.pattern.abstractfactory.dao.impl.AccessUserDao;

public class AccessDaoFactory implements DaoFactory {
    @Override
    public UserDao createUserDao() {
        return new AccessUserDao();
    }

    @Override
    public DepartmentDao createDepartmentDao() {
        return new AccessDepartmentDao();
    }
}
