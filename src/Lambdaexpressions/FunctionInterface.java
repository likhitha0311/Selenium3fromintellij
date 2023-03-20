package Lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args) {
        Employee tim = new Employee("tim buchalka", 1);
        Employee john = new Employee("john dppper", 2);
        Employee mike = new Employee("mike jade", 3);
        Employee israel = new Employee("israel michigan", 4);
        List<Employee> list = new ArrayList<>();
        list.add(tim);
        list.add(mike);
        list.add(john);
        list.add(israel);
        Function<Employee,String> firstName= (Employee employee)->
        {
            System.out.println("I am in firstName");
           return  employee.getName().substring(0, employee.getName().indexOf(' '));
        };
        Function<String,String> upperCase= (name)-> {
            System.out.println("I am in upperCase");
           return  name.toUpperCase();
        };
        Function chainedFunction = firstName.andThen(upperCase);;
        System.out.println(chainedFunction.apply(list.get(2)));

        //BiFunction
        BiFunction<String, Employee,String> bi = (name, employee)-> name+employee.getName()+employee.getId();
        String upperName= upperCase.apply(list.get(2).getName());
        System.out.println(bi.apply(upperName,list.get(0)));;


        //Consumerchaining
        Consumer<String> c1= s->s.toUpperCase();
        Consumer<String> c2= s-> System.out.println(s.toLowerCase());
        c1.andThen(c2).accept("PAKM");;

    }
}