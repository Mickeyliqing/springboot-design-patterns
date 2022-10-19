package com.example.springbootdesignpatterns.proxy.dynamicproxy.cglib;

import com.example.springbootdesignpatterns.proxy.dynamicproxy.cglib.impl.OrderServiceImpl;
import com.example.springbootdesignpatterns.proxy.dynamicproxy.cglib.impl.UserServiceImpl;
import com.example.springbootdesignpatterns.proxy.dynamicproxy.cglib.proxy.UserInterceptor;
import com.example.springbootdesignpatterns.proxy.dynamicproxy.cglib.service.UserService;
import net.sf.cglib.proxy.Enhancer;

public class DynamicProxyCglibTest {
    public static void main(String[] args) {
        // 定义动态代理类
        Enhancer enhancerUser = new Enhancer();
        enhancerUser.setSuperclass(UserServiceImpl.class);
        enhancerUser.setCallback(new UserInterceptor());
        // 定义被代理的对象
        UserService userService = (UserService) enhancerUser.create();
        userService.saveUser();

        // 定义动态代理类
        Enhancer enhancerOrder = new Enhancer();
        enhancerOrder.setSuperclass(OrderServiceImpl.class);
        enhancerOrder.setCallback(new UserInterceptor());
        // 定义被代理的对象
        OrderServiceImpl orderService = (OrderServiceImpl) enhancerOrder.create();
        orderService.saveOrder();

    }
}
