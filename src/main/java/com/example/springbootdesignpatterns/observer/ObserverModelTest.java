package com.example.springbootdesignpatterns.observer;
import com.example.springbootdesignpatterns.observer.impl.ObservedClass;
import com.example.springbootdesignpatterns.observer.impl.ObserverClass;
import com.example.springbootdesignpatterns.observer.impl.WatchClass;
import com.example.springbootdesignpatterns.observer.service.ObservedInterface;


public class ObserverModelTest {
    public static void main(String[] args) {
        ObservedInterface observed = new ObservedClass();
        observed.add(new ObserverClass());
        observed.add(new WatchClass());
        observed.change();
    }
}
