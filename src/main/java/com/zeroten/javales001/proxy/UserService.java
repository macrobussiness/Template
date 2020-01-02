package com.zeroten.javales001.proxy;

import java.lang.reflect.Proxy;

/**
 * 业务服务层
 * 基于接口来做时：
 * 接口命名以 Service 为后缀
 * 接口实现命名以 ServiceImpl 为后缀
 */
public class UserService {
    public static void directCall() {
        User user1 = new User("张三", 20);
        new UserDaoImpl().save(user1);

        User user2 = new User("", 20);
        new UserDaoImpl().save(user2);

        User user3 = new User("张三", -10);
        new UserDaoImpl().save(user3);
    }

    public static void staticProxyCall() {
        User user1 = new User("张三", 10);
        UserDao userDao = new UserDaoImpl();
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.save(user1);
    }

    public static void jdkProxyCall() {
        User user1 = new User("张三", -1);

        UserDaoImpl userDao = new UserDaoImpl();

        UserInvocationHandler handler = new UserInvocationHandler(userDao);

        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(
                userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                handler
        );

        userDaoProxy.save(user1);
        userDaoProxy.delete();
    }

    public static void jdkProxyCall2() {
        User user = new User("张三", -1);
        User2Dao user2Dao = new User2Dao();

        UserInvocationHandler handler = new UserInvocationHandler(user2Dao);
        User2Dao user2DaoProxy = (User2Dao) Proxy.newProxyInstance(
                user2Dao.getClass().getClassLoader(),
                user2Dao.getClass().getInterfaces(),
                handler
        );
        user2DaoProxy.save(user);
    }

    public static void cglibProxyCall() {
        User user = new User("张三", -1);
        User2Dao user2Dao = new User2Dao();

        User2DaoCgligProxy cglibProxy = new User2DaoCgligProxy(user2Dao);
        User2Dao user2DaoProxy = (User2Dao) cglibProxy.getProxyInstance();
        user2DaoProxy.save(user);

//        UserDao userDao = new UserDaoImpl();
//        User2DaoCgligProxy cglib2 = new User2DaoCgligProxy(userDao);
//        UserDao userDaoProxy = (UserDao) cglib2.getProxyInstance();
//        userDaoProxy.save(user);
    }

    public static void main(String[] args) {
        // 直接调用
        // directCall();

        // 1 静态代理
        // staticProxyCall();

        // 2 动态代理
        // jdkProxyCall();

        // 2 动态代理 - 被代理对象不是基于接口来实现的
        // jdkProxyCall2();

        // 3 Cglib代理，因为它是通过子类的方式来实现的，因此也可以称为子类代理
        cglibProxyCall();
    }
}
