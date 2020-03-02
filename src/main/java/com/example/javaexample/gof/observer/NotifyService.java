package com.example.javaexample.gof.observer;

import java.util.Arrays;
import java.util.List;

/**
 * 观察者模式
 * @author xphzz
 * @date 2019/8/7
 */
public class NotifyService {

    private List<Observer> observerList;

    public NotifyService(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public void notifyService(String msg){
        System.out.println("开始通知啦...");
        for (Observer o : observerList) {
            o.handler(msg);
        }
    }

    public static void main(String[] args) {
        NotifyService notifyService = new NotifyService(Arrays.asList(new ObserverAImpl(),
                new ObserverBImpl()));
        notifyService.notifyService("通知啦");
    }
}
