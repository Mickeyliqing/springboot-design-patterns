package com.example.springbootdesignpatterns.decoratormodel;

import com.example.desgindemo.decoratormodel.decorator.Decorator;
import com.example.desgindemo.decoratormodel.decorator.DecoratorConcrete;
import com.example.desgindemo.decoratormodel.impl.DecoratorClass;
import com.example.desgindemo.decoratormodel.service.DecoratorInterface;

public class DecoratorModelTest {
    public static void main(String[] args) {
        DecoratorInterface decoratorInterface = new DecoratorClass();
        Decorator decorator = new DecoratorConcrete(decoratorInterface);
        decorator.execute();
    }
}
