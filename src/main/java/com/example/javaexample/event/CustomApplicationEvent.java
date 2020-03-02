package com.example.javaexample.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author xphzz
 * @date 2019/8/3
 */
public class CustomApplicationEvent extends ApplicationEvent {
    public CustomApplicationEvent(Object source,final String msg) {
        super(source);
    }
}
