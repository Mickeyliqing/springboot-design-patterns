package com.example.springbootdesignpatterns.factorymethod.factory;

import com.example.springbootdesignpatterns.factorymethod.service.Product;

/**
 * 抽象工厂类，为工厂具体实现类提供扩展
 */
public abstract class Factory {
    public abstract  <T extends Product> T createProduct(Class<T> t);
}
