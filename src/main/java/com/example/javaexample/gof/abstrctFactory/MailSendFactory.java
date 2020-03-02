package com.example.javaexample.gof.abstrctFactory;

public class MailSendFactory implements IProvider {

	@Override
	public ISend send() {
		return new MailSend();
	}

}
