package com.example.springbootdesignpatterns.decoratormodel.decorator;


import com.example.springbootdesignpatterns.decoratormodel.service.DecoratorInterface;

/**
 * 创建具体的装饰器类
 */
public class DecoratorConcrete extends Decorator{
    public DecoratorConcrete(DecoratorInterface decoratorInterface) {
        super(decoratorInterface);
    }

    public void before() {
        System.out.println("DecoratorConcrete 前操作");
    }

    public void after() {
        System.out.println("DecoratorConcrete 后操作");
    }

    public void execute() {
        before();
        decoratorInterface.execute();
        after();
    }
}
