package com.basics2;

import java.util.Scanner;

public class Try_Catch_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int n;
		try {
			arr[8]=5;
		}
		catch(Exception e) {
			System.out.println("array index out of bound");
		}
		finally{
			System.out.println("size of array is 5");
		}
	}

}
