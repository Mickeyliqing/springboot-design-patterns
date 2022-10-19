package com.example.springbootdesignpatterns.factorymethod.factory.impl;

import com.example.springbootdesignpatterns.factorymethod.factory.Factory;
import com.example.springbootdesignpatterns.factorymethod.service.Product;

/**
 * 抽象工厂类的实现
 */
public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> t) {
        Product product = null;
        try {
            product = (T)Class.forName(t.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("创建失败");
        }
        return (T)product;
    }
}
