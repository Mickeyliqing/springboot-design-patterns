package com.example.springbootdesignpatterns.factorymethod;

import com.example.springbootdesignpatterns.factorymethod.factory.Factory;
import com.example.springbootdesignpatterns.factorymethod.factory.impl.ConcreteFactory;
import com.example.springbootdesignpatterns.factorymethod.impl.AbstractProduct;
import com.example.springbootdesignpatterns.factorymethod.impl.ConcreteProduct;

public class FactoryMethodTest {
    public static void main(String[] args) {
        // 实例化工厂
        Factory factory = new ConcreteFactory();
        // 实例 ConcreteProduct 类
        ConcreteProduct concreteProduct = factory.createProduct(ConcreteProduct.class);
        concreteProduct.publicMethod();
        concreteProduct.abstractMethod();

        // 实例 AbstractProduct 类
        AbstractProduct abstractProduct = factory.createProduct(AbstractProduct.class);
        abstractProduct.publicMethod();
        abstractProduct.abstractMethod();
    }
}
