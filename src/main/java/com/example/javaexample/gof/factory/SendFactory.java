package com.example.javaexample.gof.factory;

public class SendFactory {
	
	public ISend send(String type){
		if ("SMS".equals(type.toUpperCase())) {
			return new SMSSender();
		}else if("EMAIL".equals(type.toUpperCase())){
			return new EmailSender();
		}else{
			return null;
		}
	}
	
	public ISend productSMS(){
		return new SMSSender();
	}
	
	public ISend productEmail(){
		return new EmailSender();
	}
}
