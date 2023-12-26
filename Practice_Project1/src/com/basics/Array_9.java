package com.basics;

import java.util.Scanner;

public class Array_9 {
	public static void main(String[] args) {

		int n[]= {10,20,30,40,60};
		

		/*for(int i=0;i<=n.length;i++) {
			System.out.print("arrays list: "+ n[i]);
		}*/
		int toFind=30;
		boolean found = false;
		for (int x : n) {
			  if (x == toFind) {
			    found = true;
			    break;
			  }
			}
		if(found)
			  System.out.println(toFind + " is found.");
			else
			  System.out.println(toFind + " is not found.");
		
		System.out.println("------------------------------");
		
		for(int i=0;i<=n.length;i++) {
			System.out.println("arrays list: "+ n[i]);
		 }}}
 