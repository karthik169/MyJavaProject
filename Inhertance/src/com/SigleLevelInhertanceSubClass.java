package com;

public class SigleLevelInhertanceSubClass extends SingleLevelInheritance {
	int b = 20;
	public void mul() {
		System.out.println(b*5);
	}
	public static void main(String[] args) {
		SigleLevelInhertanceSubClass s = new SigleLevelInhertanceSubClass();
		s.mul();
		s.add();
	}
}
