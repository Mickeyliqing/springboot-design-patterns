package com.example.springbootdesignpatterns.single;

/**
 * 饿汉式-线程安全
 */
public class SingleHungry {

    /**
     * 类初始化的时候就加载这个对象
     */
    private static final SingleHungry singleHungry = new SingleHungry();

    private SingleHungry() {
    }

    public static SingleHungry getInstance() {
        return singleHungry;
    }
}
