package com.basics;

import java.util.ArrayList;

public class Collection_5 {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		
		l1.add(14);
		l1.add(52);
		l1.add("java");
		l1.add(35.87);
		l1.add("s");
		
		System.out.println(l1);
		
		l1.remove(3);
		System.out.println(l1);
		
		ArrayList l2=new ArrayList();
		l2.add(71);
		l2.add("program");
		l2.add(896.2);
		
		System.out.println(l2);
		
		System.out.println(l1.equals(l2));
		
		System.out.println(l1.get(1));
		
		System.out.println(l1.indexOf(l2));
		System.out.println(l1.lastIndexOf(l1));
			

	}
	

}
