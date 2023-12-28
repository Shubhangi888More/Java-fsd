package com.basics2;
class My_Exception extends Exception{
	   String str1;
	   My_Exception(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
public class Demonstrate_exception_6 {

	public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new My_Exception("error occured..");
		}
		catch(My_Exception e){
			System.out.println("Catch Block..") ;
			System.out.println(e) ;
		}
	   }
	}
