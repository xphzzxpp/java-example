package com.example.javaexample.example;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:  [ ]
 * @date: 2020/3/2 18:56
 * @version: V1.0
 * @desc no-thread-safe 可以加锁 或者 AtomicInteger
 */
public class NoThreadSafeExample {

  private int num;
  private Object lock = new Object();

  public void add(){
    //thread-safe
//    synchronized (lock){
//      num++;
//    }
    //no-thread-safe
    num++;
  }

  public int get(){
    return num;
  }

  public static void main(String[] args) throws InterruptedException {
    final int threadNum = 1000;
    NoThreadSafeExample noThreadSafeExample = new NoThreadSafeExample();
    CountDownLatch countDownLatch = new CountDownLatch(threadNum);
    ExecutorService executorService = Executors.newCachedThreadPool();
    for (int i = 0; i < threadNum; i++) {
      executorService.execute(new Runnable() {
        @Override
        public void run() {
          noThreadSafeExample.add();
          countDownLatch.countDown();
        }
      });
      System.out.println("execing...");
    }
    countDownLatch.await();
    System.out.println("res:"+noThreadSafeExample.get());
    executorService.shutdown();
  }

}
