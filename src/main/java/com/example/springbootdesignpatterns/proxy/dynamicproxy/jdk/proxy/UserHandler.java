package com.example.springbootdesignpatterns.proxy.dynamicproxy.jdk.proxy;

import com.example.springbootdesignpatterns.proxy.staticproxy.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserHandler implements InvocationHandler {

    private final UserService userService;

    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(userService, args);
    }
}
