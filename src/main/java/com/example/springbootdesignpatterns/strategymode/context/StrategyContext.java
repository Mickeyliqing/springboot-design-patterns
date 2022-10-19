package com.example.springbootdesignpatterns.strategymode.context;


import com.example.springbootdesignpatterns.strategymode.service.StrategyInterface;

/**
 * 定义策略器的上下文
 */
public class StrategyContext {
    private final StrategyInterface strategyInterface;

    public StrategyContext(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    public void method() {
        strategyInterface.execute();
    }
}
