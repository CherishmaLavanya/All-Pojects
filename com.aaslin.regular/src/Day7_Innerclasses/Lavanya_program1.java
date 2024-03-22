package Day7_Innerclasses;
public class Lavanya_program1 
{
    void print()
   {
		System.out.println("hi....");

   }
	class Inner{
		void run()
		{
			System.out.println("runing fast");
		}
		void display()
		{
			System.out.println("testing");

		}
				
	}

 static class test1
  {
	  
	  public static void main(String args[])
	  {
		 
		  Lavanya_program1.Inner inner = new  Lavanya_program1().new Inner();
		  inner.run();
	      new Lavanya_program1().new Inner().display();
//	      Lavanya_program1 l = new Lavanya_program1();
//	     l.print();

	  }

	  }
}
