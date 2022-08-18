package com.example.javaexample.example;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: meng_wei[ ]
 * @date: 2020/3/1 16:38
 * @version: V1.0
 * @desc 无序
 */
public class HashSetExample {

  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("123");
    set.add("456");
    set.add("321");

    set.forEach(o -> System.out.println(o));
    System.out.println("-----------------------------");
    set.forEach(o -> System.out.println(o));
  }

}
