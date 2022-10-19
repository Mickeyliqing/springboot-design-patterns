package com.example.springbootdesignpatterns.observer.service;

/**
 * 定义被观察者接口 ObservedInterface
 */
public interface ObservedInterface {
    void add(ObserverInterface observer);
    void notice();
    void change();
}
