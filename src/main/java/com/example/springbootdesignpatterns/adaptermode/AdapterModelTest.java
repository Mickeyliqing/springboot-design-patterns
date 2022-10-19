package com.example.springbootdesignpatterns.adaptermode;

import com.example.springbootdesignpatterns.adaptermode.impl.AdapterClassInterface;
import com.example.springbootdesignpatterns.adaptermode.service.ObjectiveInterface;

public class AdapterModelTest {
    // 对目标接口的具体实现
    public void requestAdapter(ObjectiveInterface objectiveInterface) {
        objectiveInterface.objectRequest();
    }
    public static void main(String[] args) {
        AdapterModelTest adapterModelTest = new AdapterModelTest();
        AdapterClassInterface adapterClassInterface = new AdapterClassInterface();
        // 通过适配器实现调用
        adapterModelTest.requestAdapter(adapterClassInterface);
    }
}
