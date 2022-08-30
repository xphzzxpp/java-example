package com.example.javaexample.example;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author:  [ ]
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
    ExecutorService executorService = Executors.newFixedThreadPool(10);
    List<FutureTask> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      FutureTask<Integer> futureTask = new FutureTask<>(new FutureTaskExample());
      list.add(futureTask);
      executorService.submit(futureTask);
    }
    System.out.println("=================");
    list.forEach(o -> {
      try {
        System.out.println(o.get(10,TimeUnit.SECONDS));
      } catch (InterruptedException e) {
        e.printStackTrace();
      } catch (ExecutionException e) {
        e.printStackTrace();
      } catch (TimeoutException e) {
        e.printStackTrace();
      }
    });
  }
}
