package com.example.javaexample.gof.single;

/** 
 * CreateDate:2017年6月16日下午2:48:34 
 * @Description: 单例模式  
 * @author:xxx
 * @version V1.0   
 */
public class Singleton {
//	private static volatile Singleton instance = null;
//
//	private Singleton(){
//
//	}
//
//	public static Singleton getInstance(){
//		if (instance == null) {
//			synchronized (instance) {
//				if (instance == null) {
//					instance = new Singleton();
//				}
//			}
//		}
//		return instance;
//	}
	private static Singleton singleton = new Singleton();

	private Singleton(){

	}

	public static Singleton getInstance(){
		return singleton;
	}
}
