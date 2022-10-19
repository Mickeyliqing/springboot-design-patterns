package com.example.springbootdesignpatterns.strategymode;

import com.example.desgindemo.strategymode.context.StrategyContext;
import com.example.desgindemo.strategymode.impl.StrategicClass;
import com.example.desgindemo.strategymode.impl.StrategyClass;

public class StrategyModelTest {
    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext(new StrategyClass());
        strategyContext.method();

        StrategyContext strategyContexts = new StrategyContext(new StrategicClass());
        strategyContexts.method();
    }
}
