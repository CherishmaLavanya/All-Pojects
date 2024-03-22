package com.aaslin.staticinner;

public class Outer {
       static class Inner{
    	 static void message()  
    	 {
    		 System.out.println("Inner static method");
    	 }
       }
	  public static void main(String[] args)
	  {
		 Outer.Inner inner = new Outer.Inner();
		 Outer.Inner.message();
	  }
}
