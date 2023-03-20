package Debugging;

public class StringDemo
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        StringPractice sp = new  StringPractice();
      int p=0;
      while(p<10)
      {
          sp.addChar(sb,'a');
          p++;
      }

    }
}