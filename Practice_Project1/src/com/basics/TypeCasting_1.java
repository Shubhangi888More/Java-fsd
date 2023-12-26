package com.basics;

public class TypeCasting_1 {

	public static void main(String[] args) {
		//implicit type casting(Widening)
		
		int i=68;
		char c=(char)i;
		
		System.out.println("implicit type casting(Widening)");
		System.out.println("integer value: "+ i);
		System.out.println("character value: "+ c);
		System.out.println("----------------------");
		
		//explicit type casting (Narrowing)
		
		double d=69.5;
		char c1=(char) d;
		
		System.out.println("explicit type casting(Narrowing)");
		System.out.println("double value: "+ d);
		System.out.println("character value: "+ c1);
		System.out.println("----------------------");
		

	}

}
