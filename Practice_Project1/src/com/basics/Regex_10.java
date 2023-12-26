package com.basics;
import java.util.regex.*;
public class Regex_10 {
	public static void main(String args[]){  
		System.out.println(Pattern.matches(".s", "s"));//true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "as"));//false (2nd char is not s)  
		System.out.println(Pattern.matches(".s", "sms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
 
}
}