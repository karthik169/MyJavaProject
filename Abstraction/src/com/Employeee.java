package com;

public  class Employeee extends Karthik{
	@Override
	public void work() {
		System.out.println("Working.....");
	}
	public static void main(String[] args) {
		Employeee e = new Employeee();
		e.work();
	}
	
}