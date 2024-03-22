package Day7_Innerclasses;

import com.aaslin.regular.Outer.Inner;

import Day7_Innerclasses.Outers1.Inner3;

class Outers1
{
    Inner3 display()
    {
    	Inner3 i = new Inner3();
		return i; 
    }
    class Inner3
    {
    	void print()
    	{
    		System.out.println("this is nested class");
    	}
    }
}

public class Lavanya_program6 {

	public static void main(String[] args) {
		Outers1 o = new Outers1();
		Inner3 i = o.display();
		i.print();
	}

}
