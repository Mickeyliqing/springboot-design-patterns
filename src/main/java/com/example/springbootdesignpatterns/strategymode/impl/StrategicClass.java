package com.example.springbootdesignpatterns.strategymode.impl;


import com.example.springbootdesignpatterns.strategymode.service.StrategyInterface;

/**
 * 策略接口实现类 StrategyClass
 */
public class StrategicClass implements StrategyInterface {
    @Override
    public void execute() {
        System.out.println("这是策略接口实现类 StrategicClass");
    }
}
