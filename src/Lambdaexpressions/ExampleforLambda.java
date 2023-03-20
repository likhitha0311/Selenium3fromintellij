package Lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleforLambda
{
    public static void main(String[] args)
    {
//        Interface1 i1 = new Interface1(){
//
//            @Override
//            public String generateString(String m1) {
//                return m1.repeat(2);
//            }
//        };

        Interface2 i22 = new Interface2(){

            @Override
            public String generateStringforInterface2(String m1) {
                return m1.repeat(2);
            }
        };
       // Interface2 i3 = (m1)-> {return m1.repeat(2);};
        Interface2 i3 = (m1)-> m1.repeat(2);
        System.out.println(i3.generateStringforInterface2("Happiness"));

        List<String>places = new ArrayList<>();
        places.add("Ana");
        places.add("Bengal");
        places.add("Calicut");
        System.out.println(places.stream().filter(p->p.equals("Bengal")).collect(Collectors.toList()));;
        Interface1 i1 = (m1)->m1.repeat(2);
        Interface1 i2 = (m1)->m1.repeat(2);
       //String result =  workOnStrings(i1.generateString("Apple"),i2.generateString("Mango"));
        String result =  workOnStrings(i1,i2,"Apple","Mango");
        System.out.println("result is "+result);
    }

    public static String workOnStrings(Interface1 s1, Interface1 s2,String s3,String s4)
    {
        return s1.generateString(s3).toUpperCase()+s2.generateString(s4).toUpperCase();
    }
}

interface Interface1
{
     String generateString(String m1);
}

interface Interface2
{
    String generateStringforInterface2(String m1);
}