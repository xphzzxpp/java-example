package com.example.javaexample.gof.abstrctFactory;

public class SMSSendFactory implements IProvider {

	@Override
	public ISend send() {
		return new SMSSend();
	}

}
