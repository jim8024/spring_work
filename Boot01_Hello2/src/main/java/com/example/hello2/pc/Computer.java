package com.example.hello2.pc;

public class Computer {
	public Cpu cpu;
	
	//생성자
	public Computer(Cpu cpu) {
		this.cpu=cpu;
	}
	//메소드
	public void action() {
		System.out.println("Conputer가 동작합니다");
	}
}
