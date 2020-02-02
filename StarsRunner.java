//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
    StarsAndStripes man = new StarsAndStripes();	   
      //call the methods needed to make the patterns on the word document
      man.printASmallBox();
      man.printTwentyDashes();
      man.printTwentyStars();
      man.printTwentyDashes();
      man.printTwentyStars();
      man.printTwentyDashes();
      man.printTwentyStars();
      man.printABigBox();
   }
}