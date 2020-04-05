import java.util.Arrays;
import java.util.Comparator;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Word implements Comparable<Word>
{
private String word;
private String[] array;

public Word()
{
    word = "";
}

public Word(String s)
{
    word = s;
}

public void setWord(String s)
{
    word = s;
}
public int compareTo(String rhs)
{
    String temp = (String)rhs;
    if(word.length() > temp.length())
        return 1;
    else if(word.length() < temp.length())
        return -1;

    return 0;
}

public void setSize(int size)
{
    array = new String[size];
}

public void add(int spot, String other)
{
    array[spot] = other;
}

public String[] sortByLength()
{
    Arrays.sort(array);
    return array;
}
public String toString()
{
    return Arrays.toString(array);
}

public static class LengthComparator implements Comparator<Word> {
    @Override
    public int compare(Word word1, Word word2) {
        return Integer.valueOf(word1.word.length()).compareTo(word2.word.length());
    }
}
@Override
public int compareTo(Word o) {
	String temp = o.word;
	return 0;
}




}