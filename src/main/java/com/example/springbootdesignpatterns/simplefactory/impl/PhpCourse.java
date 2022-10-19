package com.example.springbootdesignpatterns.simplefactory.impl;

import com.example.springbootdesignpatterns.simplefactory.service.ICourse;

/**
 * 定义 PhpCourse 类。实现接口
 */
public class PhpCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Php 课程");
    }
}
