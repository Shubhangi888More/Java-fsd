package com.basics;
import java.util.HashMap;
import java.util.Map;

public class Map_6 {
	public static void main(String[] args) {
	HashMap h1=new HashMap();
	
	h1.put(11,"ram");
	h1.put(12,"sham");
	h1.put(13, "rita");
	h1.put(14, "gita");
	h1.put(15, "mita");
	
	h1.remove(12);
	
	System.out.println(h1);
	
	h1.put(12, "sita");
	System.out.println(h1);
	
	}

}
