package com.example.springbootdesignpatterns.template.impl;

import com.example.springbootdesignpatterns.template.service.TemplateClass;

/**
 * 定义实现类 UserService，重写抽象类的方法
 */
public class UserService extends TemplateClass {

    @Override
    public void initialize() {
        System.out.println("user initialize");
    }

    @Override
    public void start() {
        System.out.println("user start");
    }

    @Override
    public void end() {
        System.out.println("user end");
    }
}
