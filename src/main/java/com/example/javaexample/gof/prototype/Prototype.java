package com.example.javaexample.gof.prototype;

/** 
 * CreateDate:2017年6月16日下午2:48:03 
 * @Description: 原型模式  
 * @author:xxx
 * @version V1.0   
 */
public class Prototype implements Cloneable{
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Prototype pro = (Prototype) super.clone();
		return pro;
	}
}
