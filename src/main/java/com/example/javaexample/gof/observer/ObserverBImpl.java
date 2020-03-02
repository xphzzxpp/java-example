package com.example.javaexample.gof.observer;

/**
 * @author xphzz
 * @date 2019/8/7
 */
public class ObserverBImpl implements Observer{
    @Override
    public void handler(String msg) {
        System.out.println(this.getClass().getName()+"接收到消息:"+msg);
    }
}
