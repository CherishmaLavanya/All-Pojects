package com.aaslin.nestedinterfcae;


interface Outer
{
	interface Inner{
	void msg();	
	}
}



public class TestInterface implements Outer.Inner {
	public void msg()
	{
		System.out.println("nested Interface");
	}
	public static void main(String[] args)
	{
		Outer.Inner inner = new TestInterface();
		inner.msg();
	}

}
