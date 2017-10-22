package com.poype.pattern.abstractfactory;

import com.poype.pattern.abstractfactory.dao.DepartmentDao;
import com.poype.pattern.abstractfactory.dao.UserDao;

public interface DaoFactory {

    UserDao createUserDao();

    DepartmentDao createDepartmentDao();
}
