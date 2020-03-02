package com.example.javaexample.gof.adapter1;

/** 
 * CreateDate:2017年6月16日下午2:47:00 
 * @Description: 对象的适配器  
 * @author:xxx
 * @version V1.0   
 */
public class Test {
	public static void main(String[] args) {
		Targetable targerable = new Wrapper(new Source());
		targerable.method1();
		targerable.method2();
	}
}
