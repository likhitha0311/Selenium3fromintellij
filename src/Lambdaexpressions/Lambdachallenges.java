package Lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Lambdachallenges
{
    public static void main(String[] args) {
        Runnable runnable = ()->{
            String mystring="lets split into array";
            String[] parts = mystring.split(" ");
            for(String part:parts)
            {
                System.out.println(part);
            }};

        runnable.run();
        Supplier<String> sup = ()-> "I love Java";
        String ilovejava = sup.get();
        System.out.println(ilovejava);
        List<String> topNames = Arrays.asList("Amelia","Amy","Alexander","Olivia","harry","emily","isla","oliver","jack");
        List<String> sortedNames =   topNames.stream().map(e->e.substring(0,1).toUpperCase()+e.substring(1)).sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println("sortedNames  is "+sortedNames );
        System.out.println(topNames.stream().map(e->e.substring(0,1).toUpperCase()+e.substring(1)).peek(System.out::println).filter(e->e.startsWith("A")).count());;
        System.out.println(topNames.stream().map(e->e.substring(0,1).toUpperCase()+e.substring(1)).peek(System.out::println).filter(e->e.startsWith("A")).collect(Collectors.toList()));;
        topNames.stream().map(e->e.substring(0,1).toUpperCase()+e.substring(1)).peek(e-> System.out.println(e+"***")).filter(e->e.startsWith("A")).forEach(System.out::println);;

    }

    }