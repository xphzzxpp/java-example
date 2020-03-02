package com.example.javaexample.gof.factory;

public class SMSSender implements ISend{

	@Override
	public String Send() {
		return "this is SMSSender";
	}

}
