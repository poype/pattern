package com.poype.pattern.abstractfactory;

import com.poype.pattern.abstractfactory.dao.DepartmentDao;
import com.poype.pattern.abstractfactory.dao.UserDao;

public class Main {
    public static void main(String[] args) {
        DaoFactory factory = new SqlServerDaoFactory(); //只要切换这句代码就可以在SQLServer和Access数据库之间切换
        UserDao userDao = factory.createUserDao();
        userDao.insertUser();
        userDao.getUser();

        DepartmentDao departmentDao = factory.createDepartmentDao();
        departmentDao.insertDepartment();
        departmentDao.getDepartment();
    }
}
/*
 从程序代码中可以看出，所有的对象都是用接口类型引用的，达到了彻底的解耦。

 抽象工厂模式：
 抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关的对象。
 它与工厂方法模式的区别就在于，工厂方法模式只创建一个产品；而抽象工厂模式则会创建多个产品，但一个抽象工厂创建的多个产品都属于同一类。
 例如本例中的抽象工厂DaoFactory可以创建UserDao和DepartmentDao两个产品，这两个产品要么属于SQLServer这个大类的，要么属于Access这一
 大类的。具体属于哪一类，由具体实现DaoFactory接口的子类决定。
 注意这里都是针对接口编程，只有这样，才能达到真正的解耦。才能非常容易的在SQLServer和Access之间切换。

 在真正的生产环境中，并不会像本例中一样，采用new的方式构建具体的抽象工厂实例。
 而是会采用IOC的方式动态配置具体的抽象工厂实例。

 当要创建一组多个产品，并且根据不同的类型，有多个产品组时，就可以考虑使用抽象工厂模式。
 */