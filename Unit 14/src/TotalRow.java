//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.lang.reflect.Array;
import java.util.*;

public class TotalRow
{
    public static void getRowTotals( int[][] m )
    {
    	int sum= 0;

        for (int i = 0; i < m.length; i++){   
        	sum = 0;
            for (int j = 0; j < m[i].length; j++){                
                sum = sum + m[i][j];
            }
            System.out.println( "Row Sum " + sum); 
                  
        }  
       
    }
    
    	
}
