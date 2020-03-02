package com.example.javaexample.event;

import org.springframework.context.ApplicationListener;

/**
 * @author xphzz
 * @date 2019/8/3
 */
public class CustomEventListener implements ApplicationListener<CustomApplicationEvent> {
    @Override
    public void onApplicationEvent(CustomApplicationEvent customApplicationEvent) {
        System.out.println(customApplicationEvent.getSource().toString());
    }
}
