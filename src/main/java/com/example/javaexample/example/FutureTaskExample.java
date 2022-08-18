package com.example.javaexample.example;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: meng_wei[ ]
 * @date: 2020/3/2 18:40
 * @version: V1.0
 * @desc
 */
public class FutureTaskExample implements Callable<Integer> {

  @Override
  public Integer call() throws Exception {
    return new Random().nextInt(100);
  }

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    FutureTask<Integer> futureTask = new FutureTask<>(new FutureTaskExample());
    Thread thread = new Thread(futureTask);
    thread.start();
    Integer res = futureTask.get();
    System.out.println("res:"+res);
  }
}
