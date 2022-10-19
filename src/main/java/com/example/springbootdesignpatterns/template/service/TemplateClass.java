package com.example.springbootdesignpatterns.template.service;

/**
 * 定义抽象类
 */
public abstract class TemplateClass {
    // 定义接口
    public abstract void initialize();
    public abstract void start();
    public abstract void end();

    // 定义模板方法
    public final void template() {
        initialize();
        start();
        end();
    }
}
