package com.basics;

class call{
	int a=14 ,b=75;
	void sum() {       //non-static method 
		int sum =a+b;
		System.out.println("sum : "+ sum);
	}
	static void m() {   // static method
		System.out.println("static method invoked");
	}
}

public class calling_3 {

	public static void main(String[] args) {
		call.m();  //static method calling(not need of object creation)
		call c1= new call(); //object creation for non-static method call
		c1.sum();//non-static method call
	}

}
