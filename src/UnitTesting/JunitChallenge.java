package UnitTesting;

public class JunitChallenge
{

    public String removePairs(String source)
    {
        if(source == null ||source.length()<1)
        {return source;}
        StringBuilder sb= new StringBuilder();
       char[] chararray= source.toCharArray();
       for(int i=0;i<chararray.length-1;i++)
       {
           if(chararray[i] != chararray[i+1])
           {
                   sb.append(chararray[i]);
           }
       }
        sb.append(chararray[chararray.length-1]);
       return sb.toString();
    }

    public int converter(int a,int b)
    {
        return (a/b)+(a*30)-2;
    }

    public String nullifoddlength(String s)
    {
        if(s.length()%2==0)
        {
            return s;
        }
        return null;
    }
}