package com;

public class Main extends Demo {
	public void work() {
		System.out.println("Working....");
	}
	public Main() {
		super(10,"Karthik");
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.work();
	}
}
