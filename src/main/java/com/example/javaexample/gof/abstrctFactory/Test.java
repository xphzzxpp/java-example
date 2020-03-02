package com.example.javaexample.gof.abstrctFactory;

/** 
 * CreateDate:2017年6月16日下午2:46:31 
 * @Description: 抽象工厂 
 * @author:xxx
 * @version V1.0   
 */
public class Test {
	public static void main(String[] args) {
		IProvider ipro = new MailSendFactory();
		System.out.println(ipro.send().Send());
		
		IProvider iproV2 = new SMSSendFactory();
		System.out.println(iproV2.send().Send());
	}
}
