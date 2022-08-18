package com.example.javaexample.example;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: meng_wei[ ]
 * @date: 2020/3/2 16:26
 * @version: V1.0
 * @desc 闭锁
 */
public class CountDownLatchExample {

  public static void main(String[] args) throws InterruptedException {

    final int threadNum = 10;
    CountDownLatch countDownLatch = new CountDownLatch(threadNum);
    ExecutorService executorService = Executors.newFixedThreadPool(threadNum);
    for (int i = 0; i < threadNum; i++) {
      executorService.execute(() -> {
        System.out.println("run...");
        countDownLatch.countDown();
      });
    }
    countDownLatch.await();
    System.out.println("end...");
    executorService.shutdown();
  }

}
