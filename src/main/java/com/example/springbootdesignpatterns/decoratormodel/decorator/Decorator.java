package com.example.springbootdesignpatterns.decoratormodel.decorator;


import com.example.springbootdesignpatterns.decoratormodel.service.DecoratorInterface;

/**
 * 定义装饰器类 Decorator
 */
public class Decorator implements DecoratorInterface {

    public DecoratorInterface decoratorInterface;

    public Decorator(DecoratorInterface decoratorInterface) {
        this.decoratorInterface = decoratorInterface;
    }

    @Override
    public void execute() {
        decoratorInterface.execute();
    }
}
