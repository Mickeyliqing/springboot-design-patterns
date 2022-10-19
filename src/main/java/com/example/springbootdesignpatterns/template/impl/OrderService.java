package com.example.springbootdesignpatterns.template.impl;

import com.example.springbootdesignpatterns.template.service.TemplateClass;

/**
 * 定义实现类 OrderService，重写抽象类的方法
 */
public class OrderService extends TemplateClass {

    @Override
    public void initialize() {
        System.out.println("order initialize");
    }

    @Override
    public void start() {
        System.out.println("order start");
    }

    @Override
    public void end() {
        System.out.println("order end");
    }
}
