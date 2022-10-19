package com.example.springbootdesignpatterns.observer.impl;

import com.example.springbootdesignpatterns.observer.service.ObserverInterface;

/**
 * 实现观察者接口
 */
public class WatchClass implements ObserverInterface {
    @Override
    public void response() {
        System.out.println("观察者 WatchClass 收到了消息 ......");
    }
}
