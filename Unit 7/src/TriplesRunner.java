//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);
       String choice="";
           do{
               out.print("Enter the max number to use : ");
               int big = keyboard.nextInt();


            Triples triple = new Triples(big);
               out.println( triple );

               System.out.print("Do you want to enter more data? ");
               choice=keyboard.next();
           }while(choice.equals("Y")||choice.equals("y"));
   }
	}
