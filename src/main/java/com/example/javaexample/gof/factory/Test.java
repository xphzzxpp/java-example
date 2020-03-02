package com.example.javaexample.gof.factory;

/** 
 * CreateDate:2017年6月16日下午2:47:35 
 * @Description: 包含工厂和简单工厂模式
 * @author:xxx
 * @version V1.0   
 */
public class Test {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		/*ISend smsSend = factory.send("SMS");
		ISend emailSend = factory.send("email");*/
		ISend emailSend = factory.productEmail();
		ISend smsSend = factory.productSMS();
//		System.out.println(smsSend.Send());
//		System.out.println(emailSend.Send());
	}
}
