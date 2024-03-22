package com.aaslin.Anonymous;

interface Outer{
	 interface Inner
	 {
		 void msg();
	 }
}
public class Test {
	static Outer.Inner inner = new Outer.Inner() {
		public void msg()
		{
			System.out.println("nested inner anonymous class");
		}
	};
	public static void main(String[] args)
	{
	  inner.msg();	
	}

}
