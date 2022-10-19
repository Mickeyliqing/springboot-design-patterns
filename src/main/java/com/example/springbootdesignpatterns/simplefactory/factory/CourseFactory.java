package com.example.springbootdesignpatterns.simplefactory.factory;

import com.example.springbootdesignpatterns.simplefactory.impl.JavaCourse;
import com.example.springbootdesignpatterns.simplefactory.impl.PhpCourse;
import com.example.springbootdesignpatterns.simplefactory.service.ICourse;

/**
 * 定义工厂类，实现对应方法调用
 */
public class CourseFactory {

    public ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("php".equals(name)) {
            return new PhpCourse();
        } else {
            return null;
        }
    }
}
