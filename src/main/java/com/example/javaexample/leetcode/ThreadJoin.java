package com.example.javaexample.leetcode;

import lombok.SneakyThrows;

/**
 * @author mw
 * @date 2022/8/31
 */
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                Thread.sleep(5000);
            }
        });
        thread.start();
        long start = System.currentTimeMillis();
        thread.join();
        System.out.println(System.currentTimeMillis()-start);

    }
}
