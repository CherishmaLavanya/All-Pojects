package Day4;

abstract class  test1 {

	 abstract void biryani();
     abstract void service();
      void ingredients()
      {
     	 System.out.println("still what do u need for biryani");
      }
}    


abstract class  test2 {

	 abstract void biryani();
    abstract void service();
     void ingredients()
     {
    	 System.out.println("still what do u need for biryani");
     }
} 



    class AbstractEx2 extends test1,test2
   {
    
     
		void biryani() 
		{
	    	 System.out.println("started doing the biryani");

		}

	    void service() 
	    {
   	    System.out.println("it must be served.....");

	    }
     }
     
     
   
   

   public static void main(String args[])
  {
	 AbstractEx2  o = new AbstractEx2();
  	 o.ingredients();
  	 o.biryani();
  	 o.service();
   }
}
