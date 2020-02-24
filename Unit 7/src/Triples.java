
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;
import java.util.*;
public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int lim = 0;
		 	lim = Math.min(a, b);
		    lim = Math.min(lim, c);
		    for(int n = lim; n >= 1; n--)
		    {
		        if ( (a % n == 0) && (b % n == 0) && (c % n == 0) ) {
		            return n;
		        }
		    }

		    return 1;
	}

	public String toString()
	{
		
		String output = "";
	    
	    int max = number;
	    for(int a = 1; a < max; a++)
	    {
	  
	        for(int b = a; b < max; b++)
	        {
	           
	            for(int c = b; c < max; c++)
	            {
	               
	                if(Math.pow(a, 2)+ Math.pow(b, 2)== Math.pow(c, 2))
	                {
	                    if((a%2==1 && b%2==0)|| (a%2==0 && b%2==1))
	                    {
	                        if(c%2==1)
	                        {
	                        	if(greatestCommonFactor(a, b, c) == 1)
	                        		output = output + " " + a + " " + b + " " + c + "\n";	                        	
	                        }
	                    }
	                }
	            }
	        }
	    }
	    
		return output;
	  
	}
}
