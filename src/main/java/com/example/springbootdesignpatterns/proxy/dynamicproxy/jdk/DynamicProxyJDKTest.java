package com.example.springbootdesignpatterns.proxy.dynamicproxy.jdk;

import com.example.springbootdesignpatterns.proxy.dynamicproxy.jdk.proxy.UserHandler;
import com.example.springbootdesignpatterns.proxy.staticproxy.impl.UserServiceImpl;
import com.example.springbootdesignpatterns.proxy.staticproxy.service.UserService;

import java.lang.reflect.Proxy;

public class DynamicProxyJDKTest {
    public static void main(String[] args) {
        // 实例化对象
        UserService userService = new UserServiceImpl();
        // 实例化代理类对象
        UserHandler userHandler = new UserHandler(userService);

        ClassLoader classLoader = userService.getClass().getClassLoader();
        Class<?>[] interfaces = userService.getClass().getInterfaces();
        UserService userProxy = (UserService) Proxy.newProxyInstance(classLoader, interfaces, userHandler);
        userProxy.saveUser();
    }
}
