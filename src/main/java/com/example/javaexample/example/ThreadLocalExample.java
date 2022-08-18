package com.example.javaexample.example;

import java.util.Arrays;
import java.util.List;

/**
 * @author: meng_wei[ ]
 * @date: 2020/3/3 17:42
 * @version: V1.0
 * @desc threadLocalExample
 */
public class ThreadLocalExample {

  public static void main(String[] args) {
    ThreadLocal<List<String>> threadLocal = new ThreadLocal<>();

    Thread thread1 = new Thread(() -> {
      threadLocal.set(Arrays.asList("123","321"));
      threadLocal.set(Arrays.asList("323243443"));
      threadLocal.get().forEach(o -> System.out.println("thread1:" + o));
    });

    Thread thread2 = new Thread(() -> {
      threadLocal.set(Arrays.asList("456","567"));
      threadLocal.get().forEach(o -> System.out.println("thread2:" + o));
    });

    thread1.start();
    thread2.start();

  }

}
