package Day4;

public class OverloadingExample {
	
	public void area(int l,int b)
	{
		int a = l * b;
		System.out.println("the area with  int of l*b id is :" + a);
		
	}
	public float area(float l,float b)
	{
		float c = (l * b);
		System.out.println("the area with  int of l*b id is :" + c);
		return c;

	}
	public static void main(String[] args) 
	{
		
		OverloadingExample o = new OverloadingExample();
         o.area(5, 10);        
         o.area(2.3f, 4.6f);
		
	}

}
