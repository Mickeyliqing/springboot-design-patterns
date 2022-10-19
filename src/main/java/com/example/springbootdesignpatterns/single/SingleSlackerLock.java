package com.example.springbootdesignpatterns.single;

/**
 * 懒汉式-双重同步锁
 */
public class SingleSlackerLock {

    private static volatile SingleSlackerLock singleSlackerLock = null;

    private SingleSlackerLock() {
    }

    /**
     * 运行时加载
     * @return
     */
    public static SingleSlackerLock getInstance() {
        if (singleSlackerLock == null) {
            synchronized (SingleSlackerLock.class) {
                if (singleSlackerLock == null) {
                    singleSlackerLock = new SingleSlackerLock();
                }
            }
        }
        return singleSlackerLock;
    }
}
