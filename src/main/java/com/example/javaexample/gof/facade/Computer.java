package com.example.javaexample.gof.facade;

public class Computer {
	private CPU cpu;
	private Disk disk;
	
	
	
	public Computer() {
		this.cpu = new CPU();
		this.disk = new Disk();
	}

	public void startUp(){
		System.out.println("Computer is startUp");
		cpu.startUp();
		disk.startUp();
	}
	
	public void shutDown(){
		System.out.println("Computer is shutDown");
		cpu.shutdown();
		disk.shutdown();
	}
	
	
}
