package com.example.javaexample.gof.proxy;

/** 
 * CreateDate:2017年6月16日下午2:48:15 
 * @Description: 代理模式  
 * @author:xxx
 * @version V1.0   
 */
public class Test {
	public static void main(String[] args) {
		Sourceable sourceable = new Proxy();
		sourceable.method1();
	}
}
