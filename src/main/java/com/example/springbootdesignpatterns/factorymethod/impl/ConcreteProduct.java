package com.example.springbootdesignpatterns.factorymethod.impl;

import com.example.springbootdesignpatterns.factorymethod.service.Product;

/**
 * 定义具体的类，实现抽线类 Product
 */
public class ConcreteProduct extends Product {
    @Override
    public void abstractMethod() {
        System.out.println("具体类：ConcreteProduct");
    }
}
