package com.example.javaexample.example;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:  []
 * @date: 2020/3/2 17:23
 * @version: V1.0
 * @desc 循环屏障
 */
public class CyclicBarrierExample {

  public static void main(String[] args) {
    final int threadNum = 10;
    CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
    ExecutorService executorService = Executors.newFixedThreadPool(10);
    for (int i = 0; i < threadNum; i++) {
      executorService.execute(new Runnable() {
        @Override
        public void run() {
          System.out.println("begin...");
          try {
            cyclicBarrier.await();
          } catch (InterruptedException e) {
            e.printStackTrace();
          } catch (BrokenBarrierException e) {
            e.printStackTrace();
          }
          System.out.println("end ...");
        }
      });
    }
    executorService.shutdown();
  }

}
