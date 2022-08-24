package com.example.javaexample.gof.decorator;


public class Decorator implements Sourceable{

	private Sourceable sourceable;
	
	public Decorator(Sourceable sourceable){
		this.sourceable = sourceable;
	}
	
	@Override
	public void method() {
		System.out.println("this is Decorator method start");
		sourceable.method();
		System.out.println("this is Decorator method end");
		
	}
	
}
