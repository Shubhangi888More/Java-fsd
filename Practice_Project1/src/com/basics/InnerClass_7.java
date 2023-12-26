package com.basics;
class OClass {
	  int x = 10;

	  class IClass {
	    int y = 5;
	  }
	}

	public class InnerClass_7 {
	  public static void main(String[] args) {
	    OClass o1 = new OClass();
	    OClass.IClass i1 = o1.new IClass();
	    System.out.println(i1.y + o1.x);
	  }
	}
