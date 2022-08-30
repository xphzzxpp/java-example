package com.example.javaexample.example;

import java.util.LinkedList;

/**
 * @author:  [ ]
 * @date: 2020/3/4 16:35
 * @version: V1.0
 * @desc
 */
public class LinkedListExample {

  public static void main(String[] args) {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("1");
    linkedList.add("2");
    linkedList.add("3");
    linkedList.add("4");

    linkedList.forEach(o -> System.out.println(o));
  }
}
