package com.example.javaexample.gof.facade;

/**
 * 外观模式
 */
public class Test {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.startUp();
		com.shutDown();
	}
}
