package Day4;

abstract class Preparbiryani 
{
     abstract void biryani();
     abstract void service();
     abstract void order();
     void ingredients()
     {
    	 String s = "rice";
    	 String s1 = "vegetables";
    	 System.out.println("still what do u need");
    	 
     }
}
    class Cooking extends  Preparbiryani
     {

		void biryani() 
		{
	    	 System.out.println("started doing");

		}

		void service() 
		{
	    	 System.out.println("it must be served");

		}

	     void order() 
	    {
	    	 System.out.println("order sent");

		}
}
