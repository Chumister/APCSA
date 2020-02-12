//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

public class StringEquality
{
   private String wordOne, wordTwo;

   public StringEquality()
   {
   }

   public StringEquality(String one, String two)
   {
      setWords (wordOne, wordTwo);
   }

   public void setWords(String one, String two)
   {
      wordOne = one;
      wordTwo = two;
   }

   public boolean checkEquality()
   {
      if (wordOne == wordTwo) {
      return true;
      }
      else {
      return false;
      }
     }

  public String toString()
  {
    String output = "";
    if (checkEquality()) {
    output += wordOne + " does not have the same letters as " + wordTwo;
    }else {
    output += wordOne + " does have the same letters as " + wordTwo;
    }
	return output;
    }
}