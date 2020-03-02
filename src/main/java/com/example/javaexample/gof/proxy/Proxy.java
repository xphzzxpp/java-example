package com.example.javaexample.gof.proxy;

public class Proxy implements Sourceable{
	
	private Source source;
	
	public Proxy(){
		this.source = new Source();
	}
	
	@Override
	public void method1() {
		before();
		source.method1();
		after();
	}
	
	public void before(){
		System.out.println("this is Proxy before");
	}
	
	public void after(){
		System.out.println("this is Proxy after");
	}

}
