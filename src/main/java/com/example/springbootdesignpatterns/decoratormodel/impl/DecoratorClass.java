package com.example.springbootdesignpatterns.decoratormodel.impl;


import com.example.springbootdesignpatterns.decoratormodel.service.DecoratorInterface;

/**
 * 实现被装饰对象接口
 */
public class DecoratorClass implements DecoratorInterface {
    @Override
    public void execute() {
        System.out.println("这是一个被装饰的类");
    }
}
