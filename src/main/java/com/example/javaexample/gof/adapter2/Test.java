package com.example.javaexample.gof.adapter2;

/** 
 * CreateDate:2017年6月16日下午2:47:18 
 * @Description: 接口的适配器
 * @author:xxx
 * @version V1.0   
 */
public class Test {
	public static void main(String[] args) {
		Sourceable souceable1 = new SourceSub1();
		Sourceable souceable2 = new SourceSub2();
		
		souceable1.method1();
		souceable1.method2();
		souceable2.method1();
		souceable2.method2();
	}
}
