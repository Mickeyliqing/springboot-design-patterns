package com.example.springbootdesignpatterns.proxy.dynamicproxy.cglib.impl;

import com.example.springbootdesignpatterns.proxy.dynamicproxy.cglib.service.UserService;

/**
 * 实现接口，实现类不做任何的操作
 */
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser() {
        System.out.println("用户保存方法");
    }
}
