package com.aaslin.regular;

public class Outer {
	public class Inner{
		void message()
		{
			System.out.println("Inner");
		}
	}


public static void main(String[] args)
{
	Outer outerClass = new Outer();
	Outer.Inner inner = new Outer().new Inner();
	new Outer().new Inner().message();
}
}