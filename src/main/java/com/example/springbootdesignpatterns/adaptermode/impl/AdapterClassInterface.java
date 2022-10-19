package com.example.springbootdesignpatterns.adaptermode.impl;

import com.example.springbootdesignpatterns.adaptermode.adapter.AdapterClass;
import com.example.springbootdesignpatterns.adaptermode.service.ObjectiveInterface;

/**
 * 定义适配器类
 */
public class AdapterClassInterface extends AdapterClass implements ObjectiveInterface {
    @Override
    public void objectRequest() {
        super.request();
    }
}
