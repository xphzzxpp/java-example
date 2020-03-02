package com.example.javaexample.gof.bridge;

public class Test {
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		
		bridge.setSourceable(new SourceSub1());
		bridge.method();
		
		bridge.setSourceable(new SourceSub2());
		bridge.method();
	}
}
