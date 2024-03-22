package com.aaslin.local;

public class Outer {
    void  innerMethod()
    {
    	class Inner{
    		void message()
    		{
    			System.out.println("Local Inner class");
    		}
    	}
    	//Local Instaition
    
    	Inner inner = new Inner();
    	inner.message();
    }
	public static void main(String[] args) {
     Outer outer = new Outer();
    		 outer.innerMethod();
	}

}
