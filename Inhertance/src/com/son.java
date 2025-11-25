package com;

public class son extends Father  {
	int age = 22;
	String job = "Student";
	public void display1() {
		System.out.println("son propertuies: "+age+" "+job);
	}
	public static void main(String[] args) {
		son s = new son();
		s.display();
		s.display1();
	}
}
