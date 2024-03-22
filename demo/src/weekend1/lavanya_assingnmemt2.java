package weekend1;

class vehicle {

    void bike()
		{
			System.out.println("Hello I am a motorcycle, I am a cycle with an engine");
		}
	}

class lavanya_assingnmemt2 extends vehicle
{
	
   void bike()
  {
  System.out.println("My ancestor is a cycle who is a vehicle with pedals" );
  }		
   void overri()
  {
	  super.bike();
	  bike();
   }
 
	 public static void main(String[] args) 
	 {
	 lavanya_assingnmemt2 ob = new lavanya_assingnmemt2();
	 ob.overri();	 
	 }
   }

