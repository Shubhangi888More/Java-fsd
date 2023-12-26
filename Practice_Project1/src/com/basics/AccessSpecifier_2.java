package com.basics;

class access{
	public int x=10; 
	private int y=20;
	protected int z=30;
	
	
	public void m1() {
		System.out.println("public method");
	}
	
	private void m2() {
		System.out.println("private method");
	}
	
	protected void m3() {
		System.out.println("protected method");
	}
	
	void defaultMethod() {
		System.out.println("default method");
	}
}

public class AccessSpecifier_2 {

	public static void main(String[] args) {
	
		access a= new access();
		a.m1();
		//a.m2(); //private method can not access
		a.m3();
		a.defaultMethod();
		System.out.println("public variable : " + a.x);
		//System.out.println("private variable : " + a.y); //private variable can not access
		System.out.println("protected variable : " + a.z);

	}

}
