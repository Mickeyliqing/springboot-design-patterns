package com.example.springbootdesignpatterns.proxy.staticproxy.proxy;

import com.example.springbootdesignpatterns.proxy.staticproxy.service.UserService;

/**
 * 定义代理对象，这里执行对代理对象的操作
 * 如果后续增加新的操作，只需要修改对应的实现类即可
 */
public class UserProxy {

    private final UserService userService;

    public UserProxy(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        userService.saveUser();
    }
}
