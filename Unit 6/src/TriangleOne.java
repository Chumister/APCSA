import java.util.Scanner;


public class TriangleOne {
    private String word;


    public TriangleOne()
    {
        word="";
    }

    public TriangleOne(String s)
    {
    word = s;
    }

    public void setWord(String s)
    {
    word = s;
    }

    public void print( )
    {
        int length = word.length();
        for(int i = length; i >= 0 ; i --) {
            System.out.println(word.substring(0, i));
        }
    }
   }