package com.example.springbootdesignpatterns.simplefactory.impl;

import com.example.springbootdesignpatterns.simplefactory.service.ICourse;

/**
 * 定义 JavaCourse 类。实现接口
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Java 课程");
    }
}
