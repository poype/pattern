package com.poype.pattern.abstractfactory;

import com.poype.pattern.abstractfactory.dao.DepartmentDao;
import com.poype.pattern.abstractfactory.dao.UserDao;
import com.poype.pattern.abstractfactory.dao.impl.SqlServerDepartmentDao;
import com.poype.pattern.abstractfactory.dao.impl.SqlServerUserDao;

public class SqlServerDaoFactory implements DaoFactory {
    @Override
    public UserDao createUserDao() {
        return new SqlServerUserDao();
    }

    @Override
    public DepartmentDao createDepartmentDao() {
        return new SqlServerDepartmentDao();
    }
}
