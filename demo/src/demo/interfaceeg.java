package demo;
interface A
{
	void display();
}
interface B
{
	void display();
}

public class interfaceeg implements A,B {
	public void display()
	{
		System.out.println("this is display method");
	}
	public static void main(String []args)
	{
		interfaceeg ob=new interfaceeg();
		A a=new interfaceeg();
		a.display();
		B b=new interfaceeg();
		b.display();
	}
	
}
