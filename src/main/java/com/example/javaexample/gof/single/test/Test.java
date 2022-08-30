package com.example.javaexample.gof.single.test;

import com.example.javaexample.gof.single.Singleton;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author mw
 * @date 2022/8/29
 */
public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Singleton a = Singleton.getInstance();
                    System.out.println(a);
                }
            });
        }
        executorService.shutdown();
    }
}

