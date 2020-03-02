package com.example.javaexample.gof.factory;

public class EmailSender implements ISend{

	@Override
	public String Send() {
		return "this is EmailSender";
	}
}
