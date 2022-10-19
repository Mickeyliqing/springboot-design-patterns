package com.example.springbootdesignpatterns.observer.impl;

import com.example.springbootdesignpatterns.observer.service.ObservedInterface;
import com.example.springbootdesignpatterns.observer.service.ObserverInterface;

import java.util.Vector;

/**
 * 实现被观察者接口
 */
public class ObservedClass implements ObservedInterface {
    public Vector<ObserverInterface> vector;

    @Override
    public void add(ObserverInterface observer) {
        if (vector == null) {
            vector = new Vector<>();
        }
        this.vector.add(observer);
    }

    @Override
    public void notice() {
        for (ObserverInterface observer : vector) {
            observer.response();
        }
    }

    @Override
    public void change() {
        System.out.println("观察者发生了改变 ......");
        notice();
    }
}
