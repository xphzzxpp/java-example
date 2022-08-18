package com.example.javaexample.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: meng_wei[ ]
 * @date: 2020/3/1 17:34
 * @version: V1.0
 * @desc
 */
public class CallableExample implements Callable<String> {


  @Override
  public String call() throws Exception {
    return "hello world";
  }
}

class Test{

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    FutureTask<String> task = new FutureTask<>(new CallableExample());
    Thread thread = new Thread(task);
    thread.start();
    System.out.println(task.get());
  }
}
