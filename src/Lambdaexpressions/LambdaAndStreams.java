package Lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaAndStreams
{
    public static void main(String[] args)
    {
        List<Integer> intlist= new ArrayList<>(Arrays.asList(1,2,3,6,8,90));
        System.out.println(intlist);
        //intlist.stream().forEach(e-> System.out.println("e is "+e));
        intlist.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer+12);
            }
        });
        intlist.stream().forEach(integer -> System.out.println(integer+12));
        System.out.println("*".repeat(14));
        List<Integer>outputList = intlist.stream().map(new Function<Integer, Integer>()
        {
            @Override
            public Integer apply(Integer integer) {
                return integer+6;
            }
        }).peek(e->System.out.println("peek output is "+e)).filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(outputList);


    }
}