import static java.lang.System.*;
import java.util.Arrays;

public class Word implements Comparable
{
private String word;
private  String[] array;

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

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}


}