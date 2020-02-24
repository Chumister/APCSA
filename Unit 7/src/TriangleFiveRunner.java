//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive test = new TriangleFive();
	   
	   test.setAmount(4);
	   test.setLetter('C');
	   System.out.println(test);

	   test.setAmount(5);
	   test.setLetter('B');
	   System.out.println(test);
	   test.setAmount(7);
	   test.setLetter('A');
	   System.out.println(test);
	}
}