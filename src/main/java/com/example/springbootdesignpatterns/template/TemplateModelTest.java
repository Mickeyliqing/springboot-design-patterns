package com.example.springbootdesignpatterns.template;

import com.example.springbootdesignpatterns.template.impl.OrderService;
import com.example.springbootdesignpatterns.template.impl.UserService;
import com.example.springbootdesignpatterns.template.service.TemplateClass;

public class TemplateModelTest {
    public static void main(String[] args) {
        TemplateClass templateUser = new UserService();
        templateUser.initialize();
        templateUser.start();
        templateUser.end();

        TemplateClass templateOrder = new OrderService();
        templateOrder.initialize();
        templateOrder.start();
        templateOrder.end();
    }
}
