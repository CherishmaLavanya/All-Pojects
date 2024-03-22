package Day6;

import demo.ExceptionPropagation;

public class Lavanya_program6 
{
	void num(){  
	    int data=25/0;  
	  }  
	  void action1(){  
	    num();  
	  }  
	  void action2()
	  { 
		  action1();
	  }
	  void action3()
	  {
	   try
	   {  
	    action2();  
	   }
	   catch(Exception e)
	     {
		   System.out.println("exception handled");
		  }  
	  }
	  public static void main(String args[])
	  {  
		  ExceptionPropagation obj=new ExceptionPropagation();
		  obj.action3();
	     System.out.println("normal flow...");  
	  }  
}