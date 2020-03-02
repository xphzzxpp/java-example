package com.example.javaexample.gof.adapter;

/** 
 * CreateDate:2017年6月16日下午2:03:16 
 * @Description: 类的适配器测试
 * @author:xxx
 * @version V1.0   
 */
public class Test {
	public static void main(String[] args) {
		Adapter adapter = new Targetable();
		
		adapter.method1();
		adapter.method2();
	}
}
