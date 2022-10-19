package com.example.springbootdesignpatterns.strategymode.impl;

import com.example.desgindemo.strategymode.service.StrategyInterface;

/**
 * 策略接口实现类 StrategyClass
 */
public class StrategyClass implements StrategyInterface {
    @Override
    public void execute() {
        System.out.println("这是策略接口实现类 StrategyClass");
    }
}
