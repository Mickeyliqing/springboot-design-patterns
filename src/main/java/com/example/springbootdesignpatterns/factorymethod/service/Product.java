package com.example.springbootdesignpatterns.factorymethod.service;

/**
 * 定义抽象类
 */
public abstract class Product {
    /**
     * 定义公共接口方法
     */
    public void publicMethod() {
        System.out.println("这是一个公共接口");
    }

    /**
     * 声明抽象方法
     */
    public abstract void abstractMethod();
}
