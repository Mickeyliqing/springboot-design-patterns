package com.example.springbootdesignpatterns.simplefactory;

import com.example.springbootdesignpatterns.simplefactory.factory.CourseFactory;
import com.example.springbootdesignpatterns.simplefactory.service.ICourse;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();

        ICourse java = courseFactory.create("java");
        java.record();

        ICourse php = courseFactory.create("php");
        php.record();
    }
}
