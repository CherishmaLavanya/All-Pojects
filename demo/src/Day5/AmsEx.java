 package Day5;

public class AmsEx 
{
    public static void main(String args[])
    {
    	int i;
    	int n;
    	int r;
    	int s=0;
    	for(i = 1; i < 1000 ; i++)
    	{
    		n  = i;
    		while (n > 0)
    		{
    		  r = n % 10;
    		  n = n / 10;
    		  s = (r*r*r)+s;
    		}
        	System.out.println(s);

    	}
    	//System.out.println(s);
    		
    }
	}
