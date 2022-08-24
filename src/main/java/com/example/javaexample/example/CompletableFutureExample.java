package com.example.javaexample.example;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * @author mw
 * @date 2022/8/18
 */
public class CompletableFutureExample {
    @SneakyThrows
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        CompletableFuture cfe = CompletableFuture.supplyAsync(new Supplier<String>() {
            @SneakyThrows
            @Override
            public String get() {
                Thread.sleep(1000);
                return "hahaha";
            }
        });
        long end = System.currentTimeMillis()-start;
        System.out.println("time:"+end);
        System.out.println(cfe.get());
        end = System.currentTimeMillis()-start;
        System.out.println("time:"+end);

    }
}

