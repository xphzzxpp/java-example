package com.example.javaexample.gof.decorator;

/** 
 * CreateDate:2017年6月16日下午4:36:27 
 * @Description: 装饰模式  
 * @author:xxx
 * @version V1.0   
 */
public class Test {
	public static void main(String[] args) {
		Sourceable source = new Decorator(new Source());
		source.method();
	}
}
