//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class LetterRemoverRunner {
public static void main(String args[])
{
    LetterRemover test = new LetterRemover ();
    test.setRemover("I really want dumplings","l");
    System.out.println(test.toString());
    System.out.println("Removed :"+test.removeLetters());
 }
}