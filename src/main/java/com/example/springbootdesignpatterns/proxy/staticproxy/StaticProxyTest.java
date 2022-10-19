package com.example.springbootdesignpatterns.proxy.staticproxy;

import com.example.springbootdesignpatterns.proxy.staticproxy.impl.UserServiceImpl;
import com.example.springbootdesignpatterns.proxy.staticproxy.proxy.UserProxy;
import com.example.springbootdesignpatterns.proxy.staticproxy.service.UserService;

public class StaticProxyTest {
    public static void main(String[] args) {
        // 实例化对象 UserService
        UserService userService = new UserServiceImpl();
        // 实例化代理对象 UserProxy
        UserProxy userProxy = new UserProxy(userService);
        userProxy.saveUser();
    }
}
