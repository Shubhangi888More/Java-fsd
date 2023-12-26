package com.basics;

public class StringBuffer_8 {
	
	public static void main(String[] args) {
		String str="Hello I am Learning Java";
		
		StringBuffer sb=new StringBuffer(str);//string to stringBuffer conversion
		
		StringBuilder sb1=new StringBuilder(str);//string to stringBuilder conversion
		
		System.out.println("Original string : "+str);
		System.out.println("streingBuffer string : "+ sb.toString());
		System.out.println("streingBuilder string : "+ sb1.toString());


	}

}