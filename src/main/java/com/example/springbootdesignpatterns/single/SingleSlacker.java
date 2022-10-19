package com.example.springbootdesignpatterns.single;

/**
 * 懒汉式-线程不安全
 */
public class SingleSlacker {

    private static SingleSlacker singleSlacker = null;

    private SingleSlacker() {
    }

    /**
     * 运行的时候加载这个对象
     * @return
     */
    public static SingleSlacker getInstance() {
        if (singleSlacker == null) {
            singleSlacker = new SingleSlacker();
        }
        return singleSlacker;
    }
}
