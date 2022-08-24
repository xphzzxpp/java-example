package com.example.javaexample.gof.observer;

import java.util.Arrays;

/**
 * 观察者模式
 * @author mw
 * @date 2022/8/24
 */
public class Test {
    public static void main(String[] args) {
        NotifyService notifyService = new NotifyService(Arrays.asList(new ObserverAImpl(),
                new ObserverBImpl()));
        notifyService.notifyService("通知啦");
    }
}
