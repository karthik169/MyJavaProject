package com;

public abstract class Demo {
	public abstract void work();
	public void run() {
		System.out.println("Running....");
	}
	public  Demo() {
		System.out.println("hi");
	}
	public Demo(int a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	
}

