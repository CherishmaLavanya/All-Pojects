package Day5;


public class SumOfInt {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		int c = 0;
		
		for(i = 100; i <= 200; i++)
		{
			if(i%9 == 0)
			{
			 sum = sum + i;	
			 c ++;
			}
		}
		System.out.println(sum);
		System.out.println(c);

	}

}
