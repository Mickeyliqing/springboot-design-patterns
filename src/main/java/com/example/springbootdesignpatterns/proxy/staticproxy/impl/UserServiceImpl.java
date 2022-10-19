package com.example.springbootdesignpatterns.proxy.staticproxy.impl;

import com.example.springbootdesignpatterns.proxy.staticproxy.service.UserService;

/**
 * 实现接口，实现类不做任何的操作
 */
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser() {
        System.out.println("用户保存方法");
    }
}
