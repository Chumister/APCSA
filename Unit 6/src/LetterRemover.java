//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
 private String sentence;
 private String lookFor;

public LetterRemover()
{
}

public void setRemover(String s, String rem)
{
    this.sentence = s;
    this.lookFor = rem;
}

public String removeLetters()
{
    sentence = sentence.replaceAll(lookFor,"");
    String cleaned=sentence;
    return cleaned;
}

public String toString()
{
    return sentence + " - letter to remove " + lookFor;     

}
}