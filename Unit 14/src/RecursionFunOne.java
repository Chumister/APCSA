//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import static java.lang.System.*;

public class RecursionFunOne
{
 public static int countOddDigits(int num)
 {
String a = Integer.toString(num);
  int c=0;  
  if (a.length()!=0)
{
  int b = Integer.parseInt(a.substring(0,1));
  if (b%2==1) c=1;
  if (b%2==1) c=0;
  }
  return c + countOddDigits(Integer.parseInt(a.substring(1))) ;
 }
}